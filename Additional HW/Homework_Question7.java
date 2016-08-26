import java.util.Scanner;

// Question Summary: Allow the user to enter 10 numbers...


public class Homework_Question7
{
	public static void main(String[] args)
	{
		
		// Store numbers into an array
		
		// Set up INPUT and KEYBOARD
		int input;
		Scanner keyboard = new Scanner(System.in);
		
		int[] numbers = new int[10];
		
		// For inputting numbers into the Array
		for (int index = 0; index < numbers.length; index++)
		{
			System.out.print("Input Number " + (index+1) + ": ");
			numbers[index] = keyboard.nextInt();
		}
		
		// For displaying all numbers in the Array
		//for (int index = 0; index < numbers.length; index++)
		//{
			//System.out.print(numbers[index] + ", ");
		//}
		
		System.out.println("Here comes the breakdown...");
		
		
		// bar graph
		
		System.out.println("				   Percentages");
		System.out.println("0   10   20   30   40   50   60   70   80   90   100");
		System.out.println("|    |    |    |    |    |    |    |    |    |    |");
		System.out.println("***************************************************");
		
		// End of bar graph
		
		// zeroes
		for (int index = 0; index < numbers.length; index++)
		{
			if (numbers[index] == 0)
			{
				System.out.print("*****");
			}
		}
		System.out.println(" percent ZEROES.");
		
		// positive
		for (int index = 0; index < numbers.length; index++)
		{
			if (numbers[index] > 0)
			{
				System.out.print("*****");
			}
		}
		System.out.println(" percent POSITIVE.");
		
		// negative
		for (int index = 0; index < numbers.length; index++)
		{
			if (numbers[index] < 0)
			{
				System.out.print("*****");
			}
		}
		System.out.println(" percent NEGATIVE.");
		
		
		// Find out how many are positive, negative, and zeros
		
		// Create a bar chart with 50 stars
		
	}
}
