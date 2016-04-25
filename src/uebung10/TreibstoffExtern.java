package uebung10;

public enum TreibstoffExtern {

	Diesel(9, "Text"), Normal(123, "Text"), Super(234, "aklsjd");
	
	private int oktan;
	private String text;
	
	private TreibstoffExtern(int oktan, String text){
		this.oktan = oktan;
		this.text = text;
	}

	public int getOktan() {
		return oktan;
	}

	public String getText() {
		return text;
	}
	
	
	
}
