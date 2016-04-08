package uebung1;

public class AutoMemberClass {

	// Innere Memberclass
	
	public void gibGas(int gewichtAufGaspedal){
		
		Motor motor = new Motor();
		
		motor.spritzzufuhr(10);
		
	}
	
	public class Motor {
		
		public void spritzzufuhr(int prozent){
			System.out.println("Memeberclass");
			System.out.println("MethodeSpritzufuhr");
		}
		
	}
	
}
