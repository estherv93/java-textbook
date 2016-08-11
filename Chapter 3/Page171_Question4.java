// Question summary : Write a program that has variables...

import javax.swing.JOptionPane;

public class Page171_Question4 {

	public static void main(String[] args)
	{
		String inputString;
		int testScore1, testScore2, testScore3;
		
		inputString = JOptionPane.showInputDialog("Test Score 1 = ");
		testScore1 = Integer.parseInt(inputString);
		
		inputString = JOptionPane.showInputDialog("Test Score 2 = ");
		testScore2 = Integer.parseInt(inputString);
		
		inputString = JOptionPane.showInputDialog("Test Score 3 = ");
		testScore3 = Integer.parseInt(inputString);
		
		int averageTestScore= (testScore1 + testScore2 + testScore3) / 3;
		
		if (averageTestScore >= 90 && averageTestScore <= 100) {
			JOptionPane.showMessageDialog(null, "You got an " + 
 					  "A.");
		}
		
		else {
			if (averageTestScore >= 80 && averageTestScore <= 89) {
				JOptionPane.showMessageDialog(null, "You got a " + 
	 					  "B.");
			}
			else
			{
				if (averageTestScore >= 70 && averageTestScore <= 79) {
					JOptionPane.showMessageDialog(null, "You got a " + 
		 					  "C.");
				}
				else
				{
					if (averageTestScore >= 60 && averageTestScore <= 69) {
						JOptionPane.showMessageDialog(null, "You got a " + 
			 					  "D.");
					}
					else
					{
						if (averageTestScore <= 59) {
							JOptionPane.showMessageDialog(null, "You got an " + 
				 					  "F.");
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Not sure what happened. " + 
				 					  "A.");
						}
					}
				}
			}
		}
		
		// That nested if-else-if statement life
		
		System.exit(0);
	}
}
