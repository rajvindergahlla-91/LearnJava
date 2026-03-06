package occurenceofdigit;

public class Occurence {

	int count=0;
	int digit;
	public void checkOccurence(int num,int target)
	{
		while(num>0)
		{
			digit=num%10;
			
			if(digit==target)
			{
				count++;
				
			}
			num=num/10;
		}
		System.out.println("the occurence of" + target + "is" + count);
	}
	public static void main(String[] args)
	{
		Occurence o = new Occurence();
		o.checkOccurence(15677777, 7);
	}

}
