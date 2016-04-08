package uebung2B;

import java.io.IOException;

public class Auto {
	Logger logger;
	
	
	//Konstruktor
	public Auto(Logger logger){
		this.logger = logger;
	}
	
	public void gibGas(int gewichtaufgaspedal){
		
	}
	
	public void ausgeben(){
		
		try {
			
			logger.log(this.toString());
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	// Innere Memeberklasse
	public class Motor{
		
		public void spritzufuhr(int prozentvonmaximal){
			
		}
		
	}
}
