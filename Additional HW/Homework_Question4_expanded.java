// Summary: Trying out something a bit different...

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Homework_Question4_expanded
{
	public static void main(String[] args)
	{
		
		String inputString;
		double inches;
		double height;
		
		DecimalFormat df = new DecimalFormat("#0");
		
		// Enter well's Radius and Height
		JOptionPane.showMessageDialog(null, "Find out how many gallons " 
									  + "of water are in your well!");
		
		inputString = JOptionPane.showInputDialog("Enter the well's radius in INCHES: ");
		inches = Double.parseDouble(inputString);
		
		inputString = JOptionPane.showInputDialog("Enter the well's height in FEET: ");
		height = Double.parseDouble(inputString);
		
		// Convert inches into feet, so it fits with the formula
		double radius = inches / 12;
		
		// Formula for Volume of a Cylinder
		double volume = Math.PI * (Math.pow(radius, 2)) * height;
		
		// Convert Cubic Feet to Gallons
		double gallons = volume * 7.48;
		
		// Display how many gallons of water are in your well
		JOptionPane.showMessageDialog(null, "Your well has a total of: \n" +
									  df.format(gallons) + " gallons of water");
		
		// Additional Functionality
		
		// Find out how many people each well serves
		double family = gallons / 62.5;
		
		JOptionPane.showMessageDialog(null, "This well can serve a family of: \n" +
				  df.format(family) + " people per day");
		
		System.exit(0);
	}
	
	
}
