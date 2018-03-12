
public class Calculations
{
	public static void main(String[] args)
	{
		double area;				// variable for storing the answer
		double base = 10;			// the dimensions of the triangle
		double height = 15;     // we can change the dimensions at any time


		area = (1.0/2.0)*(base * height);  // the formula to calculate area of triangle
		// the decimal is needed to let java know it is a double and not integer.
		// if we used 1/2 java thinks the answer is also an integer but 0.5 is NOT an int
		// java will cut off (truncate) the decimal portion and it would be 0

		System.out.println("The dimensions of your triangle are: ");
		System.out.println(base + " by " + height);  // prints the dimensions

		System.out.println("This results in an area of: " + area); // prints the area




	}
}
