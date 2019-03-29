/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Tutorial Task: 4d            																						
 x Description: Write class AnimalTest2 which instantiates objects Dog, Lion and Cat which extend the abstract class Animal. 
 x Date:  3/4/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */

public class AnimalTest2
{
	//declaration
	private static Dog aDog;
	private static Lion aLion;
	private static Cat aCat;
	private static Dog2 aDog2;
	private static Lion2 aLion2;
	private static Cat2 aCat2;
	
	public static void main(String[] args)// starting method  and field
	{	//instance variable
		aDog = new Dog();
		aDog.bark();
		aDog.sleep();
		//abstract method move
		aDog2 = new Dog2();
		aDog2.move();
		//instance variable
		aLion = new Lion();
		aLion.eat();
		//abstract method move
		aLion2 = new Lion2();
		aLion2.move();
		//instance variable
		aCat = new Cat();
		aCat.sleep();
		//abstract method move
		aCat2 = new Cat2();
		aCat2.move();
	}

}//end class
