package uebung2A;

public class MySQL implements Datenbanken {

	public boolean setUpConnection(String name){
		System.out.println("connection Established for " + name);
		return true;
	};
	
	public boolean saveString(String s){
		return true;
	};
	public String getString(String s){
		return "DB Entry";
	};
	
	public boolean saveObject(Object o){
		return true;
	};
	
	public boolean getObject(Object o){
		return true;
	}
}
