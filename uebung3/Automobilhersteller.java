package uebung3;

public class Automobilhersteller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auto m3 = new Auto(new Verbrennungsmotor());
		Auto i3 = new Auto(new Elektromotor());
		
		i3.getMotor().beschleunigen(100);
		m3.getMotor().beschleunigen(100);
		
	}

}
