package whileloop;

public class While1Ex {
//	Write a program that:
//		Uses a while loop
//		Prints numbers from 1 to 20
	
	
	public void printNumb()
	{
		int i =1;
		while(i<=20)
		{
			System.out.println("the number is"+ " " +i);
			i++;
		}
				
	}
	public static void main(String[] args)
	{
		While1Ex e1 = new While1Ex();
		e1.printNumb();
	}

}
