package human;

public class Face {
	String eyes;           // instance variable
	String nose= "sharp";// instance variable
	int noOfnostrils = 2;// instance variable
	int noOflips = 1;// instance variable
	Face ant;   
	static int noOfEyes=2;    // class variable
	
	public void smile()
	{
		System.out.println("we all should smile");
		int age=22;
		System.out.println(age);     //local variable
	}
	public void smell()
	{
		System.out.println("this smell is bad");
		
	}
public static void blink()
{
	System.out.println("don't blink!!");
	
}
}
