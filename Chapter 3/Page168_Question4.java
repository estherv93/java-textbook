// Question summary : Warning! This code contains ERRORS! ...

public class Page168_Question4 {

	public static void main(String[] args)
	{
		
		// For me to see if this all works:
		int score = 100;
		char grade;
		
		// NOTE: this is the question copied from the book.
		// It hasn't been answered yet
		
		switch (score)
		{
		case (score > 90):
			grade = 'A';
			break;
		case (score > 80):
			grade = 'b';
			break;
		case (score > 70):
			grade = 'C';
			break;
		case (score > 60):
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		System.out.println(grade);
	}
}
