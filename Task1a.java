// x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x //
// x Author: 1714248                                                                            					x //
// x Tutorial Task: 1a            																					x //
// x Description: To write a program that Create an application that reads (inputs from command window) two integer x //
// x Date:  3/4/2019                                                                            					x //

import java.util.Scanner;  // Using class scanner

public class Task1a
{
		public static void main(String[]args)
	{
		// Scanner created to enable input from command window //	
		@SuppressWarnings("resource") // debug error
		Scanner input=new java.util.Scanner(System.in);
		
		//Variables initialisation declared //
		int num1 =0;
		int num2 =0;
		int sum =0;
		
		//Processing phase where user will be prompted for input
		System.out.print("Enter first input:");
		num1 =input.nextInt();
		System.out.print("Enter second input:");
		num2 =input.nextInt(); 
		sum =num1 +num2;
	
		//display total of input
		System.out.print("The total sum is: "+sum);
	
	}

}//end class Task1a


