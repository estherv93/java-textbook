// Question Summary: Perfect Number

import java.util.Scanner;

public class Homework_Question6 {

	public static void main(String[] args)
	{
		
		/* 
		 * Dear Future Me:
		 * 
		 * What is a PERFECT NUMBER?
		 * 	A PERFECT NUMBER is a positive integer 
		 * 	that is equal to the sum of its PROPER DIVISORS.
		 * 
		 * What's the difference between PROPER DIVISORS and DIVISORS?
		 * 	PROPER DIVISORS are numbers that divide into a number
		 * 	and leave no remainder.
		 * 	DIVISORS are any number that divides into a number.
		 */
		
		// Set up INPUT and KEYBOARD
		int input;
		Scanner keyboard = new Scanner(System.in);
		
		// Enter a NUMBER
		System.out.println("Find out if a number is perfect.");
		System.out.print("Enter a number: ");
		input = keyboard.nextInt();
		
		// Set up the DIVISORS array
		final int DIVISORS = input - 1;
		int[] units = new int[DIVISORS];
		
		// This will hold the SUM of the PROPER DIVISORS
		int total = 0;
		
		// Find the DIVISORS of INPUT
		// Store them into the DIVISORS array for further use
		
		for (int index = 0; index < units.length; index++)
		{
			// Divide by INPUT and store DIVISORS in array
			if (index != 0)
			{
				units[index] = input%index;
			}
			
			// Find PROPER DIVISORS of INPUT within the DIVISORS array
			// and get the SUM
			if (units[index] == 0)
			{
				total += index;
			}
		}
		
		// Determine if INPUT is a PERFECT NUMBER:
		if (total == input)
		{
			System.out.println("Nice! This number is perfect.");
		}
		else
		{
			System.out.println("Sorry... This number ain't perfect.");
		}
		
		// Close KEYBOARD
		keyboard.close();
		
	}
}
