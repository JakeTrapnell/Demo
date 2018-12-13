package com.qa.OopGarage;

public class Car extends Vehicle {
	
	private int numOfDoors;
	
	public Car (int numOfDoors, String type, int numOfWheels, int speed, String modelName )
	{
		super(type, numOfWheels, speed, modelName);
		this.numOfDoors = numOfDoors;		
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

}
