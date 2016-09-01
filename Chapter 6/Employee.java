// Question Summary: Page 338 - #1 (Employee Class)

public class Employee {

	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	// Set up Constructors
	public void setName(String n)
	{
		name = n;
	}
	
	public void setIdNumber(int id)
	{
		idNumber = id;
	}
	
	public void setDepartment(String d)
	{
		department = d;
	}
	
	public void setPosition(String p)
	{
		position = p;
	}
	
	// Set up Accessors
	public String getName()
	{
		return name;
	}
	
	public int getIdNumber()
	{
		return idNumber;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	public String getPosition()
	{
		return position;
	}
}
