/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Tutorial Task: 5c            																						
 x Description: Modify the subclasses (child classes) Cat to override the method makeSound():
 x Date:  3/4/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */

public class Cat4 extends Animal4 //Subclass
{
	public String owner ="Alice";
	public void meow() //adding method
	{
		System.out.println("Meooww!"); //String displayed
	}
	
	public void makeSound() //declares method
	{
		System.out.println("The cat does meow!"); //string displayed
	}
	public String getOwner()
	{
		return owner; //Output displayed
	}
	
}//end class