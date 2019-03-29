/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Tutorial Task: 5c            																						
 x Description: modify the subclasses (child classes) Dog to override the method makeSound():
 x Date:  3/4/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */

public class Dog4 extends Animal4 //Subclass
{
	public boolean isAPet = true;
	public String owner ="Mike";
	
	public void bark() //Adding method
	{
		System.out.println("Woof!");//String displayed
	}
	
	public void makeSound() //declares method
	{
		System.out.println("The dog barks!"); //string deplayed
	}
	
	public String getOwner()
	{
		return owner;
	}

	
}//end class