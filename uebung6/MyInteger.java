package uebung6;

public class MyInteger {
	
	private int interger;
	
	public MyInteger(int integer){
		this.interger = integer;
	}
	
	public void setInteger(int integer){
		this.interger = integer;
	}
	
	public int getInterger(){
		return this.interger;
	}
	
	@Override 
	public boolean equals(Object o){
		
		if (o == null)
			return false;
		
		if (this == o)
			return true;
		
		if (!(o instanceof MyInteger))
			return false;
		
		if (o instanceof MyInteger){
			
			if (((MyInteger) o).getInterger() == this.interger){
				return true;
			}
			
		}
		
		return false;
	}
	
	@Override
	public int hashCode(){
		
		return this.interger % 4;
	}

}
