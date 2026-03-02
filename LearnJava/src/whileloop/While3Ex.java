package whileloop;

public class While3Ex {
//	Write a program that:
//		Uses a while loop
//		Adds numbers from 1 to 100
//		Prints the final sum
	public void addNum()
	{
		int sum=0;
		int i =1;
		while(i<=100)
		{
			sum= sum+i;
			
			i++;
		}
		System.out.println(" the sum is"+ " "+ sum);
	}
	public static void main(String[] args)
	{
		While3Ex e3=new While3Ex();
		e3.addNum();
	}
}
