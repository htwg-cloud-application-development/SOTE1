package uebung11;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PorrMansDbWrapper dbWrapper = new PorrMansDbWrapper("dbFile.txt");
		dbWrapper.saveWrapper(5, "Test");
	//	System.out.println(dbWrapper.loadWrapper(5));
	}

}
