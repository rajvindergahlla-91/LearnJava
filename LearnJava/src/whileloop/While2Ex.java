package whileloop;

public class While2Ex {
//	Write a program that:
//		Uses a while loop
//		Prints only even numbers between 1 and 50
	public void printEven() {
		int i = 1;
		while (i <= 50) {
			if (i % 2 == 0) {
				System.out.println(" number is"+i);

			}
			i++;

		}

	}

	public static void main(String[] args) {
		While2Ex w2 = new While2Ex();
		w2.printEven();
	}
}
