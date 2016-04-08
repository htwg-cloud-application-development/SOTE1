package uebung2A;

public interface Datenbanken {

	public boolean setUpConnection(String name);
	
	public boolean saveString(String s);
	public String getString(String s);
	
	public boolean saveObject(Object o);
	public boolean getObject(Object o);
	
}
