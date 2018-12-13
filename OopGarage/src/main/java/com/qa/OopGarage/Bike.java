package com.qa.OopGarage;

public class Bike extends Vehicle {
	
	private boolean hasKickstand;
	
	public Bike (boolean hasKickStand, String type, int numOfWheels, int speed, String modelName )
	{
		super(type, numOfWheels, speed, modelName);
		this.hasKickstand = hasKickStand;
		
	}

	public boolean isHasKickstand() {
		return hasKickstand;
	}

	public void setHasKickstand(boolean hasKickstand) {
		this.hasKickstand = hasKickstand;
	}


}
