package uebung5;

public class Peakchen {

	public Adresse adresse;
	public Groesse groesse;

	public Peakchen(){
		
		adresse = new Adresse();
		groesse = new Groesse();
		
	}
	

	@Override
	public boolean equals(Object o){
		
		if (o == null){
			return false;
		}
		
		if (this == o){
			return true;
		}
		
		if (!(o instanceof Peakchen)){
			return false;
		}
		
		if (o instanceof Peakchen){
			
			if ((((Peakchen) o).adresse.equals(this.adresse)) && (((Peakchen) o).groesse.equals(this.groesse))){
				return true;
			}
			
		}
		
		return false;
		
	}
	
	
}
