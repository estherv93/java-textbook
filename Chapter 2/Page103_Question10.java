// Question Summary: Write the code to display a dialog box that asks...

import javax.swing.JOptionPane;
public class Page103_Question10
{
	public static void main(String[] args)
	{
		String inputString;
		double annualIncome;
		
		inputString = JOptionPane.showInputDialog("What is your " + "desired annual income?");
		
		// Question for Elijah:
		// Do we have to split the dialog sentence up like:
		// ("What is your " + "desired annual income?")?
		// Or is that just how the book does it, to look pretty?
		
		annualIncome = Double.parseDouble(inputString);
		
		JOptionPane.showMessageDialog(null, "Your desired annual income is " + annualIncome);
		
		System.exit(0);
		
	}
}