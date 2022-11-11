package week1.Assignments;

public class ConvertANegativeToPositiveNumber {

	// 1. Initialize an integer with a negative number like,

	public static void main(String[] args) {

		int num = -100;

		// 2. Check if the number is a negative number
		if (num < 0) {

			// 3. If so, convert the number to a positive number
			num = num * -1;
		}
		else 
		{
			System.out.println("Not Negative Number");
		}

		// 4. Print the converted positive number

		System.out.println(num);

	}

}
