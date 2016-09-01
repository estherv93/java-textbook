// Question Summary: Page 338 - #1 (Employee Class)

public class EmployeeDemo {

	public static void main(String[] args)
	{
		// Create Susan Employee object
		Employee susan = new Employee();
		susan.setName("Susan Meyers");
		susan.setIdNumber(47899);
		susan.setDepartment("Accounting");
		susan.setPosition("Vice President");
		
		// Create Mark Employee object
		Employee mark = new Employee();
		mark.setName("Mark Jones");
		mark.setIdNumber(39119);
		mark.setDepartment("IT");
		mark.setPosition("Programmer");
		
		// Create Joy Employee object
		Employee joy = new Employee();
		joy.setName("Joy Rogers");
		joy.setIdNumber(81774);
		joy.setDepartment("Manufacturing");
		joy.setPosition("Engineer");
		
		// Create a chart to display the Employee objects
		System.out.println("Name\t\t ID Number\t Department\t\t Position\t");
		System.out.println("----------------------------------------------------------------");
		System.out.println(susan.getName() + "\t " + susan.getIdNumber() 
						+ "\t\t " + susan.getDepartment() + "\t\t " + susan.getPosition());
		System.out.println(mark.getName() + "\t " + mark.getIdNumber() 
						+ "\t\t " + mark.getDepartment() + "\t\t\t " + mark.getPosition());
		System.out.println(joy.getName() + "\t " + joy.getIdNumber() 
						+ "\t\t " + joy.getDepartment() + "\t\t " + joy.getPosition());
		
	}
}
