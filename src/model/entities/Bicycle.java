package model.entities;

public class Bicycle implements CarbonFootprint{
	
	private static final int EMISSSIONFACTOR = 20;

	private String model;
	private String brand;
	private double amountTraveled;
	
	public Bicycle(String model, String brand, double amountTraveled) {
		
		this.model = model;
		this.brand = brand;
		this.amountTraveled = amountTraveled;
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

	public void setAmountTraveled(double amountTraveled) {
		this.amountTraveled = amountTraveled;
	}

	@Override
	public double getCarbonFootprint() {
		return (EMISSSIONFACTOR / amountTraveled ) * (1 / 1.000);
	}

	@Override
	public String toString() {
		return "Bicycle: model " + model + ", brand: " + brand + ", amountTraveled: " + amountTraveled ;
	}
	
	
}