/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Tutorial Task: 1b            																						
 x Description: To write a program that Create an application that reads (inputs) three integers from the command window. 
 x The input should be calculated and display its average.
 x Date:  3/4/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */

import java.util.Scanner;  // Using class scanner

public class Task1b
{
		public static void main(String[]args)
	{
		// Scanner created to enable input from command window //	
		@SuppressWarnings("resource") // debug error
		Scanner input=new java.util.Scanner(System.in);
		
		//Variables initialisation declared //
		int num1 =0;
		int num2 =0;
		int num3 =0;
		int ascend =0;
		int sum =0;
		int average =0;
		
		//Processing phase where user will be prompted for input
		System.out.print("Enter first input:");
		num1 =input.nextInt();
		System.out.print("Enter second input:");
		num2 =input.nextInt(); 
		System.out.print("Enter third input:");
		num3 =input.nextInt();
		
		//using if statement to sort the numbers in ascending order
		if (num1 >= num2)
		{
			ascend = num2;
			num2 = num1;
			num1 = ascend;	
		}
		if (num2 >= num3)
		{
			ascend = num3;
			num3 = num2;
			num2 = ascend;
		}
		if (num1 >= num2)
		{
			ascend = num1;
			num1 = num2;
			num2 = ascend;
		}
		
		sum =num1 + num2 + num3;
		average = sum/3;
	
		//printing out the users input in ascending order
		System.out.println("the acsending order are:");
		System.out.println("the acsending is: " + num1);
		System.out.println("the acsending is: " + num2);
		System.out.println("the acsending is: " + num3);
		
		//displaying the input average
		System.out.println("The total average is: "+ average);
	
	}

}//end class Task1b



