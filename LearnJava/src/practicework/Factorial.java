package practicework;

public class Factorial {
	int fac=1;
public void factor(int num)
{
	for(int i=num;i>0;i--)
	{
		fac = fac*i;
		
	}
	System.out.println("The Factorial of number is "+ fac);
}
public static void main(String[] args)
{
	Factorial  fc= new Factorial ();
	fc.factor(3);
}
}
