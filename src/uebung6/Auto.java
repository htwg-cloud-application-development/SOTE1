package uebung6;

public class Auto {

	private int fahrgestellnummer;
	private String typ;
	
	public Auto(int nummer, String typ){
		
		this.fahrgestellnummer = nummer;
		this.typ = typ;
		
	}

	public int getFahrgestellnummer() {
		return fahrgestellnummer;
	}

	public void setFahrgestellnummer(int fahrgestellnummer) {
		this.fahrgestellnummer = fahrgestellnummer;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fahrgestellnummer;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Auto other = (Auto) obj;
		if (fahrgestellnummer == other.fahrgestellnummer)
			return true;

		return false;
	}
	
	
	
}
