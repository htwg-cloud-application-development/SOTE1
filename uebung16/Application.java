package uebung16;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Gabel gabel0 = new Gabel(0);
		Gabel gabel1 = new Gabel(1);
		Gabel gabel2 = new Gabel(2);
		Gabel gabel3 = new Gabel(3);
		Gabel gabel4 = new Gabel(4);

		Philosoph phil0 = new Philosoph(0, gabel4, gabel0);
		Philosoph phil1 = new Philosoph(1, gabel0, gabel1);
		Philosoph phil2 = new Philosoph(2, gabel1, gabel2);
		Philosoph phil3 = new Philosoph(3, gabel2, gabel3);
		Philosoph phil4 = new Philosoph(4, gabel3, gabel4);
		
		phil0.start();
		phil1.start();
		phil2.start();
		phil3.start();
		phil4.start();
		
		phil0.join();
		phil1.join();
		phil2.join();
		phil3.join();
		phil4.join();
		
		System.out.println("Ende");
		
	}

}
