
public class Car {
	private int carPosition;
	private String carColor;
	public int randomNumber;
	
	
	public Car(int floor, String color){
		this.carPosition = floor;
		this.carColor = color;
		randomNumber++;
		
	}
	
	public void setCarColor(){
		this.carColor = "white";
	}
	
	public String getCarColor() {
		return this.carColor;
	}
	
	public int getCarPosition() {
		return this.carPosition;
	}
	
	public static void printCarColors(Car[] cars) {
		for (int i = 0 ; i < cars.length; i++) {
			System.out.println(cars[i].getCarColor());
		}
	}
	
	
	public static void main(String[] args) {
		
		Car blueCar = new Car(0,"blue");
		System.out.println(blueCar.randomNumber);
		
		Car redCar = new Car(0,"red");
		
		Car greenCar = new Car(1,"green");
		
		Car orangeCar = new Car(1,"orange");
		System.out.println(orangeCar.randomNumber);
		
		Car purpleCar = new Car(2,"purple");
		
		System.out.println(blueCar.randomNumber);
		System.out.println(orangeCar.randomNumber);
		System.out.println(purpleCar.randomNumber);
		
		Car[] cars = {blueCar,redCar,greenCar,orangeCar,purpleCar};
		
		// call static method
		//printCarColors(cars);
		
		int[][] test = new int[9][9];
		
		int counter = 1;
		
		for (int rowNumber=0;rowNumber<test.length;rowNumber++){
			for (int columnNumber=0; columnNumber<test[rowNumber].length;columnNumber++) {
				test[rowNumber][columnNumber] = counter;
				counter++;
			}
		}
		counter = 1;
		
		
		

		
		
		
		
		
		
		
		

	}

}
