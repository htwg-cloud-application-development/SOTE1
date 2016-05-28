package uebung13;

public class Student {

	@SqlType(sqlType=SqlAttribute.VARCHAR, persist=true)
	private String name;
	
	@SqlType(sqlType=SqlAttribute.INTERGER, persist=true)
	private int matrikelNr;
	
	public Student(String name, int matrikelNr){
		this.name = name;
		this.matrikelNr = matrikelNr;
	}
	
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
