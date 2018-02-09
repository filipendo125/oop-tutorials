
public class Car {
	private int carPosition;
	private String carColor;
	
	// Creates a car instance with a specified car location within 
	// parking lot and the car color
	public Car(int floor, String color){
		this.carPosition = floor;
		this.carColor = color;
	}
	
	// set car color to white
	public void setCarColor(){
		this.carColor = "white";
	}
	
	// return car color
	public String getCarColor() {
		return this.carColor;
	}
	
	// return car position
	public int getCarPosition() {
		return this.carPosition;
	}
	
	
	public static void main(String[] args) {
		
		Car[] cars = new Car[5];
		
		// create cars with positioning and car color
		Car blueCar = new Car(0,"blue");
		Car redCar = new Car(0,"red");
		Car greenCar = new Car(1,"green");
		Car orangeCar = new Car(1,"orange");
		Car purpleCar = new Car(2,"purple");
		
		// assign cars to array
		cars[0] = blueCar;
		cars[1] = redCar;
		cars[2] = greenCar;
		cars[3] = orangeCar;
		cars[4] = purpleCar;
		
		// Set and print new car color 
		blueCar.setCarColor();
		System.out.println(blueCar.getCarColor());
		
		// For all cars, if car is at ground floor and is blue, then print car color
		// else if it is on the ground floor and not blue, tell it move
		// otherwise if car is anyone but first floor, tell the car is not within our scope
		
		// This version has no error checking!
		for(int z=0;z<cars.length;z++){
			if (cars[z].getCarPosition() == 0) {
				if (cars[z].getCarColor().equals("blue")) {
					System.out.println(cars[z].getCarColor());
					break;
				} else {
					System.out.println("Move");
				}
			} else if (cars[z].getCarPosition() == 1) {
				System.out.println("1st floor");
			}
			else {
				System.out.println("Wrong floor, bruh");
			}
		}
		System.out.println("\n");
		
		/* Alternative solution */
		 
		 /*
		 int i = 0;
		 while(i < cars.length) {
			System.out.println(cars[i].getCarColor());
			i++;
		} */
		
		System.out.println("\n");
		
		/* Do-while solution. This loop is executed at least once */
		/*
		i = 0;
		do {
			System.out.println(cars[i].getCarColor());
			i++;
		} while (i < 3);
		*/
		
		
		
		
		
		

	}

}
