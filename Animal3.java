/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Tutorial Task: 4a            																						
 x Description: Write class Animal (superclass) which has the following variables and methods which every animal
 x (object of class Animal) will share: Task will implement the concept of polymorphism using overriding.
 x Date:  3/4/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */

public class Animal3 //Superclass Animal to share
{	//declaring boolen and string
	public boolean isAPet = true;
	public String owner = "John";
	
	public void sleep() //declares method
	{
		System.out.println("Sleeping");//string displayed
	}
	//adding method and field
	public void eat()
	{
		System.out.println("Eating");// declares method
	}
	
	public void makeSound() //declares method
	{
		System.out.println("the animal makes sound"); //string displayed
	}

}//end class

