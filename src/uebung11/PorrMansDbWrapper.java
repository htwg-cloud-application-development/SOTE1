package uebung11;

import uebung11.PoorMansDatabase;
import java.io.IOException;

public class PorrMansDbWrapper {

	
		private String filename;
		private PoorMansDatabase db;
	
	
	public PorrMansDbWrapper(String filename) {
		
		try {
			
			this.filename = filename;
			this.db = new PoorMansDatabase(filename);
			
		} catch (IOException ioEx){
			
			System.out.println("! " + filename + " does not exist?");
			
		}
	}
	
	public String getFilename() {
		return filename;
	}


	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	public void saveWrapper(int key, String value){
		
		try {
			
			db.save(key, value);
		
		} catch (IOException ioEx) {
			
			System.out.println("Catched IOEX in Save");
			
		}
		
	}
	
	public String loadWrapper(int key){
	
		String reValue;
		
		try {
			reValue = db.load(key);
			return reValue;
			
		} catch (IOException ioEx){
		
		
			System.out.println("Catched IOEx in load");
			return null;
		}	
		
	}
}
