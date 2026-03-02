package whileloop;

public class While4Ex {
//	Uses a while loop
//	Prints table of 5 till 10
	
	public void createTable()
	{
		int i =1;
		while (i<=50)
		{
			if(i%5==0)
				
			{
				System.out.println( " the multiple is"+ " "+ i);
			}
			i++;
		}
	}
	public static void main (String[] args)
	{
		While4Ex mt=new While4Ex();
		mt.createTable();
	}

}
