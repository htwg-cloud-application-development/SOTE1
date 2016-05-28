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
				
				//Schaut ob linke Gabel frei ist
				while (!linkeGabel.liegtAufTisch){
					System.out.println("idle ");
				}
				
				// nimm linke und rechte gabel
				if(linkeGabel.greifeGabel(this) && rechteGabel.greifeGabel(this)){
					Thread.sleep((long) (Math.random() * 100));
					System.out.println("Essen" +  this.toString() + " " + i);
					rechteGabel.legeGabelHin(this);
					
				}
				
				linkeGabel.legeGabelHin(this);
	
				
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
			
			
		}
	}
	
	@Override
	public String toString(){
		
		return "Philosoph_" + this.nummer;
		
	}
}
