package model.enums;

public enum HeatingSystemType {

	MINERAL_COAL(0.82,"Carvão Mineral"),
	NATURAL_GAS(0.20,"Gás Natural"),
	DIESEL_OIL(0.27,"Óleo Diesel"),
	FIREWOOD(0.70,"Lenha");
	
	private double emissionFactor;
	private String description;
	
	private HeatingSystemType(double emissionFactor, String description) {
		this.emissionFactor = emissionFactor;
		this.description = description;
	}
	
	public double getEmissionFactor() {
		return emissionFactor;
	}
	public String getDescription() {
		return description;
	}
	
	public static HeatingSystemType toEnum(Double emissionFactor) {
		if(emissionFactor == null ) {
			return null;
		}
		for(HeatingSystemType x : HeatingSystemType.values()) {
			if(emissionFactor.equals(x.getEmissionFactor())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Invallid");
	}

}
