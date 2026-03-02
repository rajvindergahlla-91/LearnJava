package forloop;

public class Ex4 {
//	Write a program that:
//		Loop from 1 to 30
//		If number divisible by 4 → use continue
//		Print all other numbers
	public void progress()
	
	{
		for(int i=1;i<=30;i++)
		{
			if(i%4==0)
			{
				continue;
			}
			System.out.println("numbers are" + " " + i);
			
			
		}
	}
		public static void main (String[] args)
		{
			Ex4 cont= new Ex4();
			cont.progress();
		}
	

}
