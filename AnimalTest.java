/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Tutorial Task: 4b            																						
 x Description: Write class AnimalTest which instantiates objects Dog, Lion and Cat which extend the class Animal. 
 x Date:  3/4/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */

public class AnimalTest
{
	private static Dog aDog;
	private static Lion aLion;
	private static Cat aCat;
	
	public static void main(String[] args) //starting main
	{	
		aDog = new Dog();//declaring variable
		aDog.bark();
		aDog.sleep();
		
		aLion = new Lion();//declaring variable
		aLion.eat();
		
		aCat = new Cat();//declaring variable
		aCat.sleep();
	}

}//end class
