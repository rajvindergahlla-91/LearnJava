package factorial;

public class FactorialOfANumber {
	
	int fac=1;

	public void factor(int num)
	{
		for(int i=num;i>=1;i--)
		{
			 fac= fac*i;
			
			 
		}
	
	System.out.println("the factorial of 5 is"+fac);
	
	}
	public static void main(String[] args)
	{
		FactorialOfANumber fn=new FactorialOfANumber();
		fn.factor(4);
	}
	}
	


