package factorial;

public class FactorialOfANumber {
	
	int fac=1;

	public void factor()
	{
		for(int i=5;i>=1;i--)
		{
			 fac= fac*i;
			
			 
		}
	
	System.out.println("the factorial of 5 is"+fac);
	
	}
	public static void main(String[] args)
	{
		FactorialOfANumber fn=new FactorialOfANumber();
		fn.factor();
	}
	}
	


