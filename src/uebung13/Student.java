package uebung13;

public class Student {

	@SqlAttribute(sqlType=SQLType.VARCHAR, persist=true)
	private String name;
	
	@SqlAttribute(sqlType=SQLType.INTERGER, persist=true)
	private int matrikelNr;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMatrikelNr() {
		return matrikelNr;
	}
	public void setMatrikelNr(int matrikelNr) { 
		this.matrikelNr = matrikelNr;
	}
	
	
}
