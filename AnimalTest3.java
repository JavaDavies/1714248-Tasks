/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Tutorial Task: 5b            																						
 x Description: Write class AnimalTest3 which instantiates objects Dog3, Lion3 and Cat3 which extend the class Animal3. 
 x Date:  3/4/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */

public class AnimalTest3
{		//object declares
	private static Dog3 aDog3;
	private static Lion3 aLion3;
	private static Cat3 aCat3;
	
	public static void main(String[] args)
	{	//Linking all the object to their main classes
		aDog3 = new Dog3();
		aDog3.makeSound();
		aDog3.sleep();
		
		//Linking all the object to their main classes
		aLion3 = new Lion3();
		aLion3.makeSound();
		aLion3.eat();
		
		//Linking all the object to their main classes
		aCat3 = new Cat3();
		aCat3.makeSound();
		aCat3.sleep();
	}

}//end class
