package uebung10;

public class Car {

	
	public enum Treibstoffsorte{
		Diesel(8, "Diesel-BÄM"), Super(91, "Super!!!!"), Normal(123, "Normal:asd");
	
		private int oktan;
		private String ausgabe;
		
		private Treibstoffsorte(int oktan, String ausgabe){
			this.oktan = oktan;
			this.ausgabe = ausgabe;
		}
		
		
		public int getOktan() {
			return oktan;
		}

		public String getAusgabe() {
			return ausgabe;
		}	

	}
	
	private String typ;
	private Treibstoffsorte treibstoffsorte;
	
	public Car(String typ, Treibstoffsorte treibstoffsorte){
		this.typ = typ;
		this.treibstoffsorte = treibstoffsorte;
	}
	
	
	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public Treibstoffsorte getTreibstoffsorte() {
		return treibstoffsorte;
	}


	public void setTreibstoffsorte(Treibstoffsorte treibstoffsorte) {
		this.treibstoffsorte = treibstoffsorte;
	}
	
	
	
	

}
