// Question Summary: Page 338 - #2 (Car Class)

package homework;

public class Car {

	private int yearModel;
	private String make;
	private int speed;
	
	// Set up Constructors
	public void setYearModel(int y)
	{
		yearModel = y;
	}
	
	public void setMake(String m)
	{
		make = m;
	}
	
	public void setSpeed(int s)
	{
		speed = 0;
	}
	
	// Set up Other Methods
	public int accelerate()
	{
		speed += 1;
		return speed;
	}
	
	public int brake()
	{
		speed -= 1;
		return speed;
	}
	
	// Set up Accessors
	public int getYearModel()
	{
		return yearModel;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public int getSpeed()
	{
		return speed;
	}
}
