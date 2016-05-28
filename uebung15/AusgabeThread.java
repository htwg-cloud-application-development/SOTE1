package uebung15;

public class AusgabeThread extends Thread {

	private String ausgabetext;

	public AusgabeThread(String ausgabetext) {

		this.ausgabetext = ausgabetext;

	}

	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println(ausgabetext);

			try {
				AusgabeThread.sleep(100);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
