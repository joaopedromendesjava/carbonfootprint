package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Bicycle;
import model.entities.Building;
import model.entities.Car;
import model.entities.CarbonFootprint;
import model.enums.HeatingSystemType;
import model.enums.VehicleFuelType;

public class CarbonFootPrintRun {

	public static void main(String[] args) {
		
		
		Bicycle bicycle = new Bicycle("Aro 29 Aço Carbono Ksvj", "KSW", 15.000);
		Car car = new Car("Jetta 2.0 TSI", "volkswagen", 70.000, VehicleFuelType.GASOLINE);
		Building building = new Building("Rua: Professor nelson figueiredo", "MG", "Brasil", 
				65, "Ap 302",HeatingSystemType.NATURAL_GAS , 20.000);
		
		List<CarbonFootprint> carbonFootprints = new ArrayList<>();
		
		carbonFootprints.add(bicycle);
		carbonFootprints.add(building);
		carbonFootprints.add(car);
		
		for(CarbonFootprint footprint : carbonFootprints) {
			System.out.println();
			System.out.println(footprint);
			System.out.printf("Value carbon footprint is: " + "%.2f", footprint.getCarbonFootprint());
			System.out.println();
		}
		
	}

}
