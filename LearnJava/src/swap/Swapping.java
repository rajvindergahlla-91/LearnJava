package swap;

public class Swapping {

	public void swapTwoNum(int a,int b)
	{
		a+=b;
		b=a-b;
		a-=b;
		System.out.println(" the swapped values of a is " + a);
		System.out.println("the swapped value of b is "+ b);
		
	}

public static void main(String[] args)
{
	Swapping s =new Swapping();
	s.swapTwoNum(78, 66);
}
}
