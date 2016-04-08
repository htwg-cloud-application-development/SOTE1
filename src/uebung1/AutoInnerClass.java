package uebung1;

public class AutoInnerClass {
	
	
	public void gibGas(int gewichtGasPedal){
			
		class Motor{
			
			public void spritzufuhr(int prozent){
		
				System.out.println("Innerclass");
				System.out.println("Methode Spritzufuhr");
				
			}
			
		}
		
		Motor motor = new Motor();
		motor.spritzufuhr(10);
		
	}

}
