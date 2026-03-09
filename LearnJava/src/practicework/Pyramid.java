package practicework;

public class Pyramid {
	int row = 4;

	public void printPyramid() {
		for (int i = 1; i <= row; i++) // for number of lines
		{
			for (int s = 1; s <= row - i; s++) // for spaces
			{

				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) // for printing star
			{

				System.out.print("*");

			}

			System.out.println();
		}

	}

	public static void main(String[] args) {
		Pyramid pmd = new Pyramid();
		pmd.printPyramid();
	}
}
