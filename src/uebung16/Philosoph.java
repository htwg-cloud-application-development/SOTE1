package uebung16;

public class Philosoph extends Thread {

	private int nummer;
	private Gabel rechteGabel;
	private Gabel linkeGabel;
	
	public Philosoph(int nummer, Gabel rechteGabel, Gabel linkeGabel){
		this.nummer = nummer;
		this.rechteGabel = rechteGabel;
		this.linkeGabel = linkeGabel;
		
		
	}
	
	@Override
	public void run(){
		
		for(int i = 0; i<5; i++){
			
			try {
			
				Philosoph.sleep((long) (Math.random() * 100));
				
				while (!linkeGabel.liegtAufTisch){
					Philosoph.sleep(100);
				}
				
				rechteGabel.greifeGabel(this);
				
				
				
				
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
			
			
		}
		
	}
}
