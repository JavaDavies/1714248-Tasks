/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Tutorial Task: 5c            																						
 x Description: Write class AnimalTest4 which instantiates objects Dog4, Lion4 and Cat4 which extend the class Animal4. 
 x Date:  3/4/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */

public class AnimalTest4
{		//object declares
	private static Dog4 aDog4;
	private static Lion4 aLion4;
	private static Cat4 aCat4;
	
	public static void main(String[] args)
	{	//Linking all the object to their main classes
		aDog4 = new Dog4();
		aDog4.makeSound();
		aDog4.sleep();
		System.out.println(aDog4.getOwner());
		
		//Linking all the object to their main classes
		aLion4 = new Lion4();
		aLion4.makeSound();
		aLion4.eat();
		System.out.println(aLion4.getOwner());
		
		//Linking all the object to their main classes
		aCat4 = new Cat4();
		aCat4.makeSound();
		aCat4.sleep();
		System.out.println(aCat4.getOwner());
		
	}
	

}//end class
