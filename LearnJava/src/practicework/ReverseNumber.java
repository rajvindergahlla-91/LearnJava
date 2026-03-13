package practicework;

public class ReverseNumber {
	int digit;
	int reverse=0;
	public void reversing(int num)
	
	{
	
	while(num>0)
	{
		digit= num%10;
		reverse= reverse*10+digit;
	
		num=num/10;
	}
	System.out.println(" the reverse os the number is "+ reverse);
	}
	public static void main( String[] args)
	{
		ReverseNumber rn= new ReverseNumber();
		rn.reversing(2394);
	}

}
