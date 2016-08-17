// Question Summary: Vending Machine...

import javax.swing.JOptionPane;

public class Homework_Question5
{
	public static void main(String[] args)
	{
		String inputString;
		int price;
		
		JOptionPane.showMessageDialog(null, "Welcome to the " 
				  			+ "Invisible Item Vending Machine!" 
				  			+ "\nNote: You can only pay " 
				  			+ "with a single dollar bill.");
		
		inputString = JOptionPane.showInputDialog("Enter price " 
							+ "of the item you'd like to buy:");
		price = Integer.parseInt(inputString);
		
		int change = 100 - price;
		int quarterRemainder = change % 25;
		int quarters = change / 25;
		int dimes = quarterRemainder / 10;
		int nickel = 0; 
		
		// This solution is broken.
		if (dimes <= 1)
		{
			nickel = 1;
		}
		
		JOptionPane.showMessageDialog(null, "You bought an invisible item for " 
									  + price + " cents with 1 dollar, "
									  + "\nSo your change is: " + change 
									  + " cents.");
		
		JOptionPane.showMessageDialog(null, quarters + " quarter(s)\n" 
									  + dimes + " dime(s)\n" + nickel + " nickel");
		
	}
}
//Enter price of item: 45
//You bought an item for 45 cents and gave me a dollar so your change is
//2 quarters
//0 dimes and
//1 nickel

// Okay, here's the thing: the price variable 
// cannot be more than 100 cents. I'd have to
// do one of those for loop things, maybe, to
// check for this...

// So I managed to get part of it working. 
// Now, onto the whole change bit.

// Thought I found a solution, but it doesn't
// really play out right when it needs to, lol. 