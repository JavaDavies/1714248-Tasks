/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Tutorial Task: 3b            																						
 x Description: To write a program that display summary of the test results using package import javax.swing. 
 x To display the number of who passed and the number of who failed through dialog box.
 x Date:  3/4/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */

import javax.swing.JOptionPane;

public class CourseStatsBB 
{   // Begin main function
	public static void main (String[] args)
	{   // initialise variables
		int passes =0;
		int failure = 0;
		int countstudent = 1;
		int result;
		
		// Using counter-controlled loop to process 20 student
		while (countstudent <= 20) {							//obtaining input from the user
			String stResult = JOptionPane.showInputDialog(null, "Enter result (1=pass, 2=fail):");
			result = Integer.parseInt(stResult);
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
		
		// printing out the number of passes or failure then terminate
		JOptionPane.showInputDialog( "pass %d\n", passes);
		JOptionPane.showInputDialog( "fail %d\n", failure);
		
		// Displaying a congratulation message if more than 16 passes
		if (passes >= 16) {
			JOptionPane.showMessageDialog(null, "Congratulations to Tutors!\n");
		} // end if
		
	} 

} // end class
