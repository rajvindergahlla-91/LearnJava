package myprograms;

import myprograms.basicprograms.Dog;

public class HelloWorld 
{
 String fullName = "Rajvinder";

public  void jump()
{
	System.out.println("My name is Minarv");
}
public static void main( String[] args)
{

	HelloWorld hworld=new HelloWorld();
	
	System.out.println(hworld.fullName);
	hworld.jump();
	Dog tom=new Dog();
	tom.bark();

	
	
}
}