package uebung10;

import java.util.ArrayList;
import java.util.List;

import uebung10.Car.Treibstoffsorte;

public class EnumApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car car1 = new Car("BMW", Treibstoffsorte.Diesel);
		Car car2 = new Car("AUDI", Treibstoffsorte.Super);
		Car car3 = new Car("BLA", Treibstoffsorte.Normal);
		
		List<Car> carList = new ArrayList<Car>();
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		
		for(Car car: carList){
			
			System.out.println(car.getTreibstoffsorte().getAusgabe());
			System.out.println(car.getTreibstoffsorte().getOktan());
			System.out.println();
			
		}
		
		CarWithExternEnum carEx1 = new CarWithExternEnum("BMW", TreibstoffExtern.Diesel);
		CarWithExternEnum carEx2 = new CarWithExternEnum("CAR", TreibstoffExtern.Normal);
		CarWithExternEnum carEx3 = new CarWithExternEnum("AKLDS", TreibstoffExtern.Super);
		
		List<CarWithExternEnum> carExList = new ArrayList<CarWithExternEnum>();
		carExList.add(carEx3);
		carExList.add(carEx2);
		carExList.add(carEx1);
		
		for(CarWithExternEnum car: carExList){
			System.out.println();
			System.out.println(car.getAuto());
			System.out.println(car.getTreibstoff().getOktan());
			System.out.println(car.getTreibstoff().getText());
			System.out.println();
		}
	
		
	}
	
}
