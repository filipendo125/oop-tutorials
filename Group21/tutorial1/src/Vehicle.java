
public class Vehicle {
	private int wheels;
	private String color;

	// Create an instance of a vehicle such as car, bike etc. with specified color
	public Vehicle(int numberOfWheels, String color){
		this.wheels = numberOfWheels;
		this.color = color;
	}
	
	// Return number of wheels of our vehicle
	public int getWheels() {
		return this.wheels;
	}

	public static void main(String[] args) {
	}
}
