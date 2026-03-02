package forloop;

public class Ex2 {
//	Reverse Counting with Stop Condition
//	Write a program that:
//	Uses a for loop from 20 down to 1
//	If number is divisible by 4 → print it
//	If number equals 8 → stop the loop using break
	public void reverseCount()
	{
		for(int i=20;i>=1;i--)
		{
			if(i%4==0)
			{
				System.out.println("the number is"+" "+i);
	
			}
			if(i==8) {
			break;}
		}}
		public static void main(String[] args)
		{
			Ex2 rc=new Ex2();
			rc.reverseCount();
		}
	}

