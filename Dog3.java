/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Tutorial Task: 5a            																						
 x Description: modify the subclasses (child classes) Dog to override the method makeSound():
 x Date:  3/4/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */

public class Dog3 extends Animal3 //Subclass
{
	public void bark() //Adding method
	{
		System.out.println("Woof!");//String displayed
	}
	
	public void makeSound() //declares method
	{
		System.out.println("The dog barks!"); //string deplayed
	}

	
}//end class