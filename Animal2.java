/*
 x x x x x x x x x x x x x x x x x x x x x  x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 x Author: 1714248                                                                            						
 x Tutorial Task: 4d            																						
 x Description: Write class Animal2 (Abstract class) which has the following variables and methods which every animal
 x (object of class Animal) will share:
 x Date:  3/4/2019                                                                            
 x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x x
 */

abstract class Animal2 //Abstract class
{
	public boolean isAPet = true;
	public String owner = "John";
	
	public abstract void move(); //declares method
	
}
