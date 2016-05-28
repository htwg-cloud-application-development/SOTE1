package uebung11;

import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			String dbPath = "/home/max/workspace/SOTE1/bin/uebung11/dbFile.txt";
			
			PorrMansDbWrapper dbWrapper = new PorrMansDbWrapper(dbPath);
			System.out.println("Db under " + dbPath);
			
			dbWrapper.saveWrapper(5, "Test");
			System.out.println("5 + Test");
			
			System.out.println(dbWrapper.loadWrapper(5));
			System.out.println(dbWrapper.loadWrapper(123));
			
			
		} catch (IOException ioEX){
			
			System.out.println(ioEX.getMessage());
			
		}
		
		try{
			System.out.println(Application.halbieren(12));
			System.out.println(Application.halbieren(13));
		} catch (ArithmeticException arEx) {
			System.out.println(arEx.getMessage());
		}
		
	}
	
	public static int halbieren(int Zahl) throws ArithmeticException {
	
		if (Zahl % 2 != 0){
			throw new ArithmeticException("Parameter war keine Gerade Zahl");
		} else {
			Zahl = Zahl / 2;
		}
		
		return Zahl;
	}

}
