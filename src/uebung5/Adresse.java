package uebung5;

public class Adresse {

	private String empfeanger;
	private String strasse;
	private int plz;
	private String ort;
	
	
	public String getEmpfeanger() {
		return empfeanger;
	}
	public void setEmpfeanger(String empfeanger) {
		this.empfeanger = empfeanger;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public int getPlz() {
		return plz;
	}
	public void setPlz(int plz) {
		this.plz = plz;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	@Override
	public boolean equals(Object o){
		
		if (o == null){
			return false;
		}
		
		if (this == o){
			return true;
		}
		
		// Wieso kein public ?
		boolean eq = false;
		
		if (o instanceof Adresse){
			
			eq = true;
			
			if (!((Adresse) o).getEmpfeanger().equals(this.empfeanger)){
				eq = false;
			} else if (!((Adresse) o).getOrt().equals(this.ort)){
				eq = false;
			} else if (!((Adresse) o).getStrasse().equals(this.strasse)){
				eq = false;
			} else if (((Adresse) o).getPlz() != this.plz){
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
