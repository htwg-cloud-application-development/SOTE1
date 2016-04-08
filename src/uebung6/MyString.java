package uebung6;

public class MyString {
	
	private String str;
	
	public MyString(String str){
		
		this.str = str;
	}
	
	public void setStr(String str){
		this.str = str;
	}
	
	public String getStr(){
		return this.str;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		MyString other = (MyString) obj;
		
		if (str == null) {
			if (other.str != null)
				return false;
			
		} else if (!str.equals(other.str))
			return false;
		
		return true;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + ((str == null) ? 0 : str.hashCode());
		
		return result;
	}

}
