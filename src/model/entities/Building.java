package model.entities;

import model.enums.HeatingSystemType;

public class Building implements CarbonFootprint {

	private String address;
	private String state;
	private String country;
	private int number;
	private String complement;
	private double heatingValue;
	private double annualConsumptiongas;
	
	public Building() {

	}
	
	public Building(String address, String state, String country, int number, String complement, HeatingSystemType heatingValue,
			double annualConsumptiongas) throws IllegalArgumentException{
		this.address = address;
		this.state = state;
		this.country = country;
		this.number = number;
		this.complement = complement;
		this.heatingValue = heatingValue.getEmissionFactor();
		this.annualConsumptiongas = annualConsumptiongas;
	
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public double getHeatingValue() {
		return heatingValue;
	}

	public double getAnnualConsumptionGas() {
		return annualConsumptiongas;
	}

	public void setAnnualConsumptionGas(double annualConsumptiongas) {
		this.annualConsumptiongas = annualConsumptiongas;
	}

	@Override
	public double getCarbonFootprint() {
		return getAnnualConsumptionGas() * getHeatingValue();
	}

	@Override
	public String toString() {
		return "Building: address: " + address + ", state: " + state + ", country: " + country + ", number: " + number
				+ ", complement: " + complement + ", heatingValue: " + heatingValue + ", annualConsumptiongas: "
				+ annualConsumptiongas;
	}
	
	
}