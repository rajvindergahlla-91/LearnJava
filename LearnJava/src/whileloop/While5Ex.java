package whileloop;

public class While5Ex {
//Uses a for loop from 1 to 50
//	If number is even → increase evenCount
//	Else → increase oddCount
//	Print both counts at the end
//	👉 Try to use if-else inside the loop.
	
//	int ec=0;
//	int oc=0;
	public void countEvenOdd()
	{
		int ec=0;
		int oc=0;
		int i=1;
		
		while(i<=50)
			
		{
		if(i%2==0)
		{
			ec++;
		}
		else {
			oc++;
		}
		i++;
		}
		System.out.println("even count is" + ec);
		System.out.println("odd count is" + oc);
		}
		
	public static void main(String[] args)
	{
		While5Ex wb= new While5Ex();
		wb.countEvenOdd();
	}

}
