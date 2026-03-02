package forloop;

public class Ex3 {
//	Write a program that:
//		Loop from 1 to 100
//		If number is divisible by 7:
//		Print it
//		Use break to stop the loop
//		👉 Only first multiple should print.

public void divideSeven()
{
	for(int i=1;i<=100;i++)
	{
		if(i%7==0)
		{
			System.out.println(i);
			break;
		}
	}
}
public static void main(String[] args)
{
	Ex3 ds=new Ex3();
	ds.divideSeven();
}
}
