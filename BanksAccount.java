/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Tutorial Task: 2a            																						
 x Description: Write a JavaApp with the two classes BankAccount and BankAccountTest.  
 x The class BankAccountTest creates two BankAccount objects and initialises them with a valid balance of 2700.00 and
 x an invalid balance of -120.00, respectively. 
 x Date:  3/4/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */

public class BanksAccount {
		// instance variable
		private String name;
		private double balance;
		
		public BanksAccount(String name, double balance) //Account constructor
		{
			this.name = name;  // instant variable name assigned
			if (balance > 0.0) //if the statement is true then the content of the block is executed
			this.balance = balance;
		}
		//Allowing a valid amount to be deposited
		public void deposit(double depositAmount) 
		{
			if (depositAmount > 0.0)      // if the statement is true then the content of the block should be executed
			balance = balance + depositAmount; //adding amount input to the account
		}
		public double getBalance() // returning the account balance
		{
			return balance;
		}
		//Allow names to be defined
		public void setName(String name)
		{
			this.name = name;
		}
		// Displaying the defined name appropriately
		public String getName()
		{
			return name; //display name
		}
}//end class
		