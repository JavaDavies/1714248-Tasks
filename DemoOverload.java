/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Tutorial Task Overloading            																						
 x Description: Demonstrate the Method Overloading concept of the Object Oriented Programming.  
 x Create class DemoOverload which should have the following methods:
 x Date:  3/4/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */

public class DemoOverload { // Method declares
	static int intSum = 0;
	static double doubleSum = 0;
	
	static int intAverage = 0;
	static double doubleAverage = 0;
	
	static double total = 0;
	
	static int intSquare = 0;
	static double doubleSquare = 0;
	
//******************************************************************************************************************************************
	//Method overloading for sum interger()
	public static int sum(int intNumber1, int intNumber2) 
	{
		intSum = intNumber1 + intNumber2;
		return intSum;
	}
	// Method overloading double for interger()
	public static double sum(double doubleNumber1, double doubleNumber2)
	{
		doubleSum = doubleNumber1 + doubleNumber2;
		return doubleSum;
	}
//**********************************************************************************************************************************************
	//Method overloading for Average interger()
	public static int average(int intNumber1, int intNumber2)
	{
		intSum =intNumber1 + intNumber2;
		total = (intSum/2);
		intAverage = (int)total;
		return intAverage;
	}
	// Method overloading for Average bouble()
	public static double average(double doubleNumber1, double doubleNumber2)
	{
		doubleSum = doubleNumber1 + doubleNumber2;
		doubleAverage = (doubleSum/2);
		return doubleAverage;
	}
//*************************************************************************************************************************************************
	//Method overloading for square interger()
	public static int square(int intNumber1)
	{
		intSquare = intNumber1 * intNumber1;
		total = intSquare;
		intSquare = (int) total;
		return intSquare;
	}
	//Method overloading for Square double()
	public static double square(double doubleNumbe1)
	{
		doubleSquare = doubleNumbe1 * doubleNumbe1;
		return doubleSquare;
	}
//***************************************************************************************************************************************************
	//declaring the main
	public static void main(String[] args)
	{	//printing out the result of the assigned figures
		System.out.printf("Output of Sum is: %d\n", sum(5,6), 1);
		System.out.printf("Output Sum Double is: %f\n", sum(5.2,6.2), 1); 
																			
		System.out.printf("Output of Average is: %d\n", average(5,6), 2);
		System.out.printf("Output Average Double is: %f\n", average(5.2,6.2), 1);
		
		System.out.printf("Output of Square is: %d\n", square(5), 1);
		System.out.printf("Output Square Double is: %f\n", square(5.5), 1);
	}//end main
}//end class
