// Question Summary: Write the code to set up all the necessary objects for reading keyboard input...

import java.util.Scanner;
public class Page103_Question9
{
	public static void main(String[] args)
	{
		double desiredIncome;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What is your desired annual income? ");
		desiredIncome = keyboard.nextDouble();
		
		System.out.println("Your desired annual income is " + desiredIncome);
		
		keyboard.close();
	}
}