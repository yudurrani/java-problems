package part1again.cars;

public abstract class Car {
	
	String color;
	String brand;
	double enginePower;
	int maxSpeed;
	int noOfDoors;
	boolean isAutomatic;
	double currentSpeed;
	
	Car(String brand, String color, double enginePower, int maxSpeed, int noOfDoors, boolean isAutomatic){
		
		this.color=color;
		this.brand=brand;
		this.enginePower=enginePower;
		this.maxSpeed=maxSpeed;
		this.noOfDoors=noOfDoors;
		this.isAutomatic=isAutomatic;
		
	}
	
	
	public abstract double acceleration();
	public abstract double decceleration();
	public double brake() {
				
		
		return currentSpeed;
	}

	public void print() {
		
		System.out.println("Car Details:");
		System.out.println("Color" + color + "Brand"+ brand + "Engine Power"+ enginePower + "MaxSpeed"+ maxSpeed + "Doors"+ noOfDoors +" Automatic Transmittion"+ isAutomatic);
	}

}
