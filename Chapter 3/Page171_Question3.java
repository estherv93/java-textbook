// Question summary : The area of the rectangle...

import javax.swing.JOptionPane;

public class Page171_Question3
{
	public static void main(String[] args)
	{
		String inputString;
		int length1, width1;
		int length2, width2;
		
		JOptionPane.showMessageDialog(null, "Enter dimensions for Rectangle 1.");
		
		inputString = JOptionPane.showInputDialog("Rectangle 1 Length = ");
		length1 = Integer.parseInt(inputString);
		
		inputString = JOptionPane.showInputDialog("Rectangle 1 Width = ");
		width1 = Integer.parseInt(inputString);
		
		JOptionPane.showMessageDialog(null, "Enter dimensions for Rectangle 2.");
		
		inputString = JOptionPane.showInputDialog("Rectangle 2 Length = ");
		length2 = Integer.parseInt(inputString);
		
		inputString = JOptionPane.showInputDialog("Rectangle 2 Width = ");
		width2 = Integer.parseInt(inputString);
		
		int area1 = length1 * width1;
		int area2 = length2 * width2;
		
		if (area1 == area2)
		{
			JOptionPane.showMessageDialog(null, "Both Rectangles have the same area.");
		}
		else
		{
			if (area1 > area2)
			{
				JOptionPane.showMessageDialog(null, "Rectangle 1 has the greater area.");
			}
			else {
				JOptionPane.showMessageDialog(null, "Rectangle 2 has the greater area.");
			}
		}
		System.exit(0);
	}
}
