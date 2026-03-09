package practicework;

public class Square {
	int rows = 4;
	int col = 4;
	public void printSquare()
	{
		for (int i=1;i<=rows;i++)
		{
			for (int j=1;j<=col;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Square s = new Square();
		s.printSquare();
	}

}
