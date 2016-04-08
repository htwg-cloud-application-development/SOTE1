package uebung1;

public class AutoAnonymClass {
	
	public void gibGas(int gas){
		
		Motor motor = new Motor() {
			
			@Override
			public void spritzzufuhr(int prozentvonmaximal) {
				System.out.println("Anonym SpritzzufuhrS");
			}
		};
		
		motor.spritzzufuhr(gas);
		
	}
}
