// Question Summary: Write a program that reads three whole numbers...

import javax.swing.JOptionPane;

public class Homework_Question1 
{
	public static void main(String[] args)
	{
		String inputString;
		int num1, num2, num3;
		
		inputString = JOptionPane.showInputDialog("Enter a whole number: ");
		num1 = Integer.parseInt(inputString);
		
		inputString = JOptionPane.showInputDialog("Enter a second whole number: ");
		num2 = Integer.parseInt(inputString);
		
		inputString = JOptionPane.showInputDialog("Enter a third and final whole number: ");
		num3 = Integer.parseInt(inputString);
		
		int average = (num1 + num2 + num3) / 3;
		
		JOptionPane.showMessageDialog(null, "The average of these numbers is: " + average);
		
		System.exit(0);
	}
	
}
