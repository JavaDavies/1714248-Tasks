/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Tutorial Task: 2a            																						
 x Description: Write a Java Application with the class BankAccountTest.  
 x Using package import javax.swing and methods showMessageDialog, and showInputDialog of the class JOptionPane for 
 x inputting the names and balances, and for displaying the output of the class BankAccountTest.
 x Date:  3/4/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */
import javax.swing.JOptionPane; //This allow a dialog box to request for account name then display account balances

public class InputTest 
{
	private static String name;
	private static String name2;
	
	public static void main (String[]args)
	{
		//Ask user to input account name and the amount deposited via a dialog box and display the account amount for AccountA
		name = JOptionPane.showInputDialog("Name of accountA:");
		String AccountA= JOptionPane.showInputDialog("Enter Account A Amount:");
		double account = Double.parseDouble(AccountA);
		
		//Ask user to input account name and the amount deposited via a dialog box and display the account amount for AccountB
		name2 = JOptionPane.showInputDialog("Name of accountB:");	
		String AccountB= JOptionPane.showInputDialog("Enter Account B Amount:");
		double account2 = Double.parseDouble(AccountB);
		
		
		//Dialog box used to display the output of the input of both Account A and Account B
		JOptionPane.showMessageDialog(null, "Account Name is: " +name);
		JOptionPane.showMessageDialog(null,  "Account balance is: " + account);
		JOptionPane.showMessageDialog(null,  "Account Name is: " + name2);
		JOptionPane.showMessageDialog(null,  "Account balance is: " + account2);
		
	}// end methods

	

}//ens class
