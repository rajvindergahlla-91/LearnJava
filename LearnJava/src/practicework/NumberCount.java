package practicework;

public class NumberCount {
	int digit;
	public void countDigits(int num)
	{
		int i=0;
		while(i<num)
		{
			digit=num/10;
			num=digit;
			i++;
		}
		System.out.println(" the number of digits in a number is "+ i);
	}
	public static void main(String[] args)
	{
		NumberCount nc = new NumberCount();
		nc.countDigits(987);
	}

}
