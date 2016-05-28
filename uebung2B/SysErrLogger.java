package uebung2B;

public class SysErrLogger implements Logger{
	
	public void log(String text){
		
		System.err.println(text);
	}

}
