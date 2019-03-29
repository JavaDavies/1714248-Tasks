
/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Tutorial Task: 5c           																						
 x Description:Modify the subclasses (child classes) Lion to override the method makeSound():
 x Date:  3/4/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */

public class Lion4 extends Animal4 //Subclass
{
	public String owner = "Peter"; //Declaring output as peter
	public void roar() //adding method
	{
		System.out.println("Roooaar!"); //String displayed
	}
	
	public void makeSound()//declares method
	{
		System.out.println("The Lion roars");// string displayed
	}
	public String getOwner()
	{
		return owner;
	}
	

}//end class

