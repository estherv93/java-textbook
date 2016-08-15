// Question Summary: Convert Celsius to Farenheit and...

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Homework_Question2
{
	public static void main(String[] args)
	{
		
		double celsius; 
		double fahrenheit;
		DecimalFormat df = new DecimalFormat("#.0");
		String inputString;
		
		// Convert from C to F: 
		inputString = JOptionPane.showInputDialog("Convert from Celsius to Fahrenheit - \nEnter Celsius: ");
		celsius = Double.parseDouble(inputString);
		
		double convertedFahrenheit = (celsius * 9/5) + 32;
		
		JOptionPane.showMessageDialog(null, "Fahrenheit is: " + df.format(convertedFahrenheit));
		
		// Convert from F to C: 
		inputString = JOptionPane.showInputDialog("Convert from Fahrenheit to Celsius - \nEnter Fahrenheit: ");
		fahrenheit = Double.parseDouble(inputString);
		
		double convertedCelsius = (fahrenheit - 32) * 5/9;
		
		JOptionPane.showMessageDialog(null, "Celsius is: " + df.format(convertedCelsius));
		
		System.exit(0);
		
	}
	
}
