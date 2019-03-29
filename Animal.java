/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Tutorial Task: 4a            																						
 x Description: Write class Animal (superclass) which has the following variables and methods which every animal
 x (object of class Animal) will share:
 x Date:  3/4/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */

public class Animal //Superclass Animal to share
{	//constructor
	public boolean isAPet = true;
	public String owner = "John";
	
	public void sleep()
	{
		System.out.println("Sleeping");//string displayed
	}
	//adding method and field
	public void eat()
	{
		System.out.println("Eating");
	}

}//end class
