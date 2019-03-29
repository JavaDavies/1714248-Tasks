/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Tutorial Task: 3a            																						
 x Description: To write a program that display summary of the test results. 
 x To indicate the number who passed and the number who failed.
 x Date:  3/4/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */

import java.util.Scanner; //Using scanner command

public class CourseStatsA 
{   // Begin main function
	public static void main (String[] args)
	{   // initialise variables
		int passes =0;
		int failure = 0;
		int countstudent = 1;
		int result;
		// Using counter-controlled loop to process 20 student
		while (countstudent <= 20) {
			System.out.print( "Enter result (1=pass,2=fail ):" ); // obtaining input from user
			@SuppressWarnings("resource") // debug error
			Scanner input = new Scanner(System.in); // create scanner input from command window
			result = input.nextInt();
		// increment passes or failure process	
		if (result ==1) {
			passes = passes +1;
		} //end if
		else {
			failure =failure + 1;
		} // end else
		// increment student in total
		countstudent = countstudent + 1;
		} //end while
		// printing out the number of passes or failure
		System.out.printf( "pass %d\n", passes);
		System.out.printf( "fail %d\n", failure);
		// Displaying a congratulation message if more than 16 passes
		if (passes >= 16) {
			System.out.println( "Congratulations to Tutor!\n");
		} // end if
		
	} 

} // end class
