package uebung5;

public class Application {

	public static void main(String[] args) {

		Peakchen p1 = new Peakchen();
		Peakchen p2 = new Peakchen();
		Peakchen p3 = new Peakchen();
		
		p1.adresse.setEmpfeanger("Max Hildner");
		p1.adresse.setOrt("Burgkunstadt");
		p1.adresse.setPlz(96224);
		p1.adresse.setStrasse("Schrötlein");
		
		p1.groesse.setBreite(5);
		p1.groesse.setGewicht(923.23F);
		p1.groesse.setHoehe(10);
		p1.groesse.setLeange(5);
		
		p2.adresse.setEmpfeanger("Max Hildner");
		p2.adresse.setOrt("Burgkunstadt");
		p2.adresse.setPlz(96224);
		p2.adresse.setStrasse("Schrötlein");
		
		p2.groesse.setBreite(5);
		p2.groesse.setGewicht(923.22F);
		p2.groesse.setHoehe(10);
		p2.groesse.setLeange(5);

		p3.adresse.setEmpfeanger("Johann Hildner");
		p3.adresse.setOrt("Burgkunstadt");
		p3.adresse.setPlz(96224);
		p3.adresse.setStrasse("Schrötlein");
		
		p3.groesse.setBreite(10);
		p3.groesse.setGewicht(923.23F);
		p3.groesse.setHoehe(10);
		p3.groesse.setLeange(5);
		
		System.out.println("p1 equals p2");
		System.out.println(p1.equals(p2));
		
		System.out.println("p2 euals p3");
		System.out.println(p2.equals(p3));
	}

}
