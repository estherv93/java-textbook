// Question Summary: Page 338 - #2 (Car Class)

public class CarDemo {

	public static void main (String[] args)
	{
		// Create new car object
		Car mercedes = new Car();
		
		// Set the Year Model
		mercedes.setYearModel(1993);
		
		// Set the Make
		mercedes.setMake("190E");
		
		// Get the Year Model, Make, and Speed of the Car object
		System.out.println("Year Model: " + mercedes.getYearModel());
		System.out.println("Make: " + mercedes.getMake());
		System.out.println("Speed: " + mercedes.getSpeed());
		
		// Accelerate the speed 5 times
		System.out.println("\nRunning Acceleration and Printing new speed 5x");
		System.out.println("Current Speed is: " + mercedes.accelerate());
		System.out.println("Current Speed is: " + mercedes.accelerate());
		System.out.println("Current Speed is: " + mercedes.accelerate());
		System.out.println("Current Speed is: " + mercedes.accelerate());
		System.out.println("Current Speed is: " + mercedes.accelerate());
		
		// Brake the speed 5 times
		System.out.println("\nBraking and Printing new speed 5x");
		System.out.println("Current Speed is: " + mercedes.brake());
		System.out.println("Current Speed is: " + mercedes.brake());
		System.out.println("Current Speed is: " + mercedes.brake());
		System.out.println("Current Speed is: " + mercedes.brake());
		System.out.println("Current Speed is: " + mercedes.brake());
	}
}
