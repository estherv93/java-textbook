// Question Summary: Vending Machine...

import java.util.Scanner;

public class Homework_Question5
{
	public static void main(String[] args)
	{
		int price;
		Scanner keyboard = new Scanner(System.in);
		
		// Welcome to the vending machine
		System.out.print("Welcome to the Invisible Item Vending Machine!\n"
				 + "Note: You can only pay with a single dollar bill.");
		
		// Enter price for item
		System.out.print("\nEnter price of the item you'd like to buy: ");
		price = keyboard.nextInt();
		
		// Make some change
		int change = 100 - price;
		int quarters = change / 25;
		int quartersRemainder = change % 25;
		int dimes = quartersRemainder / 10;
		int dimesRemainder = quartersRemainder % 10;
		int nickels = dimesRemainder / 5;
		
		// Display your change
		System.out.println("\nYour change is:");
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: "+ dimes);
		System.out.println("Nickels: " + nickels);
		
		// Close the keyboard
		keyboard.close();
	}
}