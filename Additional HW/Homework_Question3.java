// Allow the user to enter a 3 digit number and display...

import javax.swing.JOptionPane;

public class Homework_Question3 
{
	public static void main(String[] args)
	{
		String numbers;
		
		// Input 3 numbers, then print them in reverse
		numbers = JOptionPane.showInputDialog("Enter a 3 Digit Number: ");
		
		JOptionPane.showMessageDialog(null, numbers.charAt(2) + "" + 
									  numbers.charAt(1) + "" + 
									  numbers.charAt(0));
		
		System.exit(0);
	}
}
