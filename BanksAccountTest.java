/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Tutorial Task: 2a            																						
 x Description: Write a Java Application with the class BankAccountTest.  
 x The class BankAccountTest creates two BankAccount objects and initialises them with a valid balance of 2700.00 and
 x an invalid balance of -120.00, respectively. This should display the initial amount and be able to add to the initial amount.
 x Date:  3/4/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */
import java.util.Scanner; //using scanner command

	public class BanksAccountTest
	{
		public static void main(String[] args)
		{
			BanksAccount accountA =new BanksAccount("davies", 2700.00);
			BanksAccount accountB =new BanksAccount("anu", -120.00);
			
			//This display the amount that is initially in the BankAccount
			System.out.printf("%s balance: $%.2f%n", accountA.getName(), accountA.getBalance());
			System.out.printf("%s balance: $%.2f%n%n", accountB.getName(), accountB.getBalance());
			
			@SuppressWarnings("resource") //debug errors
			Scanner input = new Scanner(System.in);// scanner allows user input from command window
			
			System.out.print("Enter deposit amount for accountA: ");// promt user
			double depositAmount = input.nextDouble(); //process user input and add to the account
			System.out.printf("%nadding %.2f to accountA's balance%n%n", depositAmount);
			accountA.deposit(depositAmount);
			
			
			//display account balance
			System.out.printf("%s balance: $%.2f%n", accountA.getName(), accountA.getBalance());
			System.out.printf("%s balance: $%.2f%n%n", accountB.getName(), accountB.getBalance());
			
			System.out.print("Enter deposit amount for accountB: ");
			depositAmount = input.nextDouble();
			System.out.printf("%nadding %.2f to accountB's balance%n%n", depositAmount);
			accountB.deposit(depositAmount);  //add to accountB balance
			//balances updated displayed
			System.out.printf("%s balance: $%.2f%n", accountA.getName(), accountA.getBalance());
			System.out.printf("%s balance: $%.2f%n%n", accountB.getName(), accountB.getBalance());
		}

}//end class
