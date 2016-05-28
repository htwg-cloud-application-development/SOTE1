package uebung15;

public class Application {

	public static void main(String[] args) throws InterruptedException {

		AusgabeThread threadA = new AusgabeThread("Hallo bin ThreadA!!");
		AusgabeThread threadB = new AusgabeThread("Hallo bin ThreadB!!");
		AusgabeThread threadC = new AusgabeThread("Hallo bin ThreadC!!");

		
		threadA.start();
		threadB.start();
		threadC.start();
		
		threadA.join();
		threadB.join();
		threadC.join();
		
		
		System.out.println("Habe fertig!");
	}

}
