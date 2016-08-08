// Question Summary: Write a program that plays a word game with the user...

import javax.swing.JOptionPane;

public class Page106_Question13 {

	public static void main(String[] args) {
		
		String inputString, name, city, college, profession, animal, petname;
		int age;
		
		name = JOptionPane.showInputDialog("What is your name?");
		city = JOptionPane.showInputDialog("What city do you live in?");
		
		inputString = JOptionPane.showInputDialog("How old " + "are you?");
		age = Integer.parseInt(inputString);
		
		college = JOptionPane.showInputDialog("What college did you go to?");
		profession = JOptionPane.showInputDialog("What profession do you have?");
		animal = JOptionPane.showInputDialog("What kind of animal do you want?");
		petname = JOptionPane.showInputDialog("What would you name the animal?");
		
		JOptionPane.showMessageDialog(null, "There once was a person named " + name + 
				" who lived in " + city + ". At the age of " + age + ", " + name + 
				" went to college at " + college + ". " + name + " graduated and went to work as a "
				+ profession + ". Then, " + name + " adopted a(n) " + animal + " named " + petname + 
				". They both lived happily ever after!");
		
		System.exit(0);
	}
}
