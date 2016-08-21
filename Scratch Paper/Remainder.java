// Some Scratch Paper to see if it all works :)
public class Remainder {
	public static void main(String[] args)
	{
		int change = 15;
		int quarters = change / 25;
		int quartersRemainder = change % 25;
		int dimes = quartersRemainder / 10;
		int dimesRemainder = quartersRemainder % 10;
		int nickels = dimesRemainder / 5;
		
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: "+ dimes);
		System.out.println("Nickels: " + nickels);
	}
}
