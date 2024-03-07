package model.enums;

public enum VehicleFuelType {

	GASOLINE(0.214,"Gasolina"),
	HYBRID(0.087,"Híbrido"),
	ELETRIC(0.063,"Elétrico");
	
	private double emissionFactor;
	private String description;
	
	private VehicleFuelType(double emissionFactor, String description) {
		
		this.emissionFactor = emissionFactor;
		this.description = description;
	}

	public double getEmissionFactor() {
		return emissionFactor;
	}

	public String getDescription() {
		return description;
	}
	
	public static VehicleFuelType toEnum(Double emissionFactor) {
		
		if(emissionFactor == null) {
			return null;
		}
		for(VehicleFuelType x : VehicleFuelType.values()) {
			if(emissionFactor.equals(x.getEmissionFactor())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Invallid");
	}
	
}
