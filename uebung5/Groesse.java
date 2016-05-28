package uebung5;

public class Groesse {
	
	private int leange;
	private int breite;
	private int hoehe;
	private float gewicht;
	
	public int getLeange() {
		return leange;
	}
	public void setLeange(int leange) {
		this.leange = leange;
	}
	public int getBreite() {
		return breite;
	}
	public void setBreite(int breite) {
		this.breite = breite;
	}
	public int getHoehe() {
		return hoehe;
	}
	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}
	public float getGewicht() {
		return gewicht;
	}
	public void setGewicht(float gewicht) {
		this.gewicht = gewicht;
	}
	
	public boolean equals(Object o){
		
		if (o == null){
			return false;
		}
		
		if (this == o){
			return true;
		}
		
		boolean eq = false;
		float gerundetGewichtO, gerundetGewichtT;
		
		if (o instanceof Groesse){
			
			eq = true;
			
			gerundetGewichtO = Math.round(((Groesse) o).getGewicht());
			gerundetGewichtT = Math.round(this.gewicht);
			
			if (((Groesse) o).getBreite() != this.breite){
				eq = false;
			} else if (((Groesse) o).getHoehe() != this.hoehe){
				eq = false;
			} else if (((Groesse) o).getLeange() != this.leange){
				eq = false;
			} else if (gerundetGewichtO != gerundetGewichtT){
				eq = false;
			}
			
		}
		
		if (eq){
			return true;
		} else {
			return false;
		}
	}
	
	

}
