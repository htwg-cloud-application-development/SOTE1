package uebung10;

import uebung10.TreibstoffExtern;;

public class CarWithExternEnum {

	private String auto;
	private TreibstoffExtern treibstoff;
	
	public CarWithExternEnum(String auto, TreibstoffExtern treibstoff){
		
		this.auto = auto;
		this.treibstoff = treibstoff;
		
	}

	public String getAuto() {
		return auto;
	}

	public void setAuto(String auto) {
		this.auto = auto;
	}

	public TreibstoffExtern getTreibstoff() {
		return treibstoff;
	}

	public void setTreibstoff(TreibstoffExtern treibstoff) {
		this.treibstoff = treibstoff;
	}
	
	
}
