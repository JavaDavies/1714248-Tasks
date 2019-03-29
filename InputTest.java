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
	public static void main (String[]args)
	{
		//Ask user to input account name in a dialog box and display the account amount for AccountA
		JOptionPane.showInputDialog("Name of accountA:");
		BanksAccount AccountA= new BanksAccount("davies", 2700.00);
		//Ask user to input account name in a dialog box and display the account amount for AccountB
		JOptionPane.showInputDialog("Name of accountB");
		BanksAccount AccountB= new BanksAccount("anu", 2800.00);
		
		//Dialog box used to display the output of the input of both Account A and B
		JOptionPane.showMessageDialog(null, "Account Name is: " + AccountA.getName());
		JOptionPane.showMessageDialog(null,  "Account balance is: " + AccountA.getBalance());
		JOptionPane.showMessageDialog(null,  "Account Name is: " + AccountB.getName());
		JOptionPane.showMessageDialog(null,  "Account balance is: " + AccountB.getBalance());
		
	}// end methods
	

}//ens class
