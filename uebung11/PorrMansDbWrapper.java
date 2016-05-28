package uebung11;

import uebung11.PoorMansDatabase;
import java.io.IOException;

public class PorrMansDbWrapper {

	private String filename;
	private PoorMansDatabase db;

	public PorrMansDbWrapper(String filename) throws IOException {

		int count = 0;
		boolean dbInitialized = false;
		
		while (!dbInitialized) {

			try {

				this.filename = filename;
				this.db = new PoorMansDatabase(filename);
				dbInitialized = true;

			} catch (IOException ioEx) {

				System.out.println("! " + filename + " does not exist?");
				count++;
			
			}
			
			if (count > 20) {
				IOException ioEx = new IOException("generation DB failed 20 times");
				throw ioEx;
			}
		}
		
	}

	public void saveWrapper(int key, String value) throws IOException {
		
		int count = 0;
		boolean dbWrite = false;
		
		while (!dbWrite) {

			try {

				db.save(key, value);
				dbWrite = true;

			} catch (IOException ioEx) {

				System.out.println("Catched ioEx");
				count++;
			
			}
			
			if (count > 5) {
				IOException ioEx = new IOException("saving to DB failed 5 times");
				throw ioEx;
			}
		}

	}

	public String loadWrapper(int key) throws IOException {

		String reValue = "";
		boolean dbLoad = false;
		int count = 0;
		
		while (!dbLoad){
		
			try {
				reValue = db.load(key);
				dbLoad = true;
				
			} catch (IOException ioEx) {

				System.out.println("Catched IOEx in load");
				count++;
			}

			if (count > 5){
				throw new IOException("load didn't work 5 Times");
			}
		}
		
		return reValue;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
}
