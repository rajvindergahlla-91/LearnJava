package dowhile;

public class DoWhile2 {
//	Uses a do-while loop
//	Calculates the sum of numbers from 1 to 10
//	Prints the final sum

	public void addNumb() {
		int sum = 0;
		int i = 0;
		do {
			sum = sum + i;
			i++;
		} while (i <= 10);
		System.out.println(" the sum of numbers is" + sum);
	}

	public static void main(String[] args) {
		DoWhile2 dw2 = new DoWhile2();
		dw2.addNumb();
	}

}
