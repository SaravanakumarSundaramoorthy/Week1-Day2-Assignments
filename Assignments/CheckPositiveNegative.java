package week1.Assignments;

public class CheckPositiveNegative {

	public static void main(String[] args) {

		// * 1. Initialize a number, say, int number= 35;

		int num = 35;

		// * If a number is negative, print "The number is negative"
		if (num < 0) 
		{
			System.out.println("Negative Number");
		}
		// 2. If a number is positive, print "The number is positive"
		else if (num > 0) {
			System.out.println("Positive Number");
		}

		// * If it nether negative nor positive,
		else {
			// print as "The number is neither positive nor negative"

			System.out.println("The number is neither positive nor negative");

		}
	}
}