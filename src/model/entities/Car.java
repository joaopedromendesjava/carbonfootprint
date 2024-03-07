package model.entities;

import model.enums.VehicleFuelType;

public class Car implements CarbonFootprint{

	private String model;
	private String brand;
	private double amountTraveled;
	private double vehicleFuelType;
	
	
	public Car(String model, String brand, double amountTraveled, VehicleFuelType vehicleFuelType) {

		this.model = model;
		this.brand = brand;
		this.amountTraveled = amountTraveled;
		this.vehicleFuelType = vehicleFuelType.getEmissionFactor();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getAmountTraveled() {
		return amountTraveled;
	}

	public void setAmountTraveled(long amountTraveled) {
		this.amountTraveled = amountTraveled;
	}

	public double getVehicleFuelType() {
		return vehicleFuelType;
	}

	@Override
	public double getCarbonFootprint() {
		return ( getVehicleFuelType() * getAmountTraveled() ) * ( 1 / 1.000 );
	}

	@Override
	public String toString() {
		return "Car model: " + model + ", brand: " + brand + ", amountTraveled: " + amountTraveled + ", vehicleFuelType "
				+ vehicleFuelType;
	}
	
}
