package uebung1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AutoMemberClass autoA = new AutoMemberClass();
		AutoMemberClass.Motor motorA = autoA.new Motor();	
		
		autoA.gibGas(100);
		motorA.spritzzufuhr(100);
		
		System.out.println("*-*-*-*-*-*-*");
		
		AutoInnerClass autoB = new AutoInnerClass();
		
		autoB.gibGas(100);
		//Kein zugriff auf innere Klasse möglich
		
		System.out.println("*-*-*-*-*-*-*");
		
		AutoAnonymClass autoC = new AutoAnonymClass();
		
		autoC.gibGas(10);
		// Zugriff auf Methode spritzzufuhr() der Anonymen Klasse Motor
		// nicht möglich...
		
	}

}
