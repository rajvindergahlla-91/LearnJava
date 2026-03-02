package dowhile;

public class DoWhile4 {
	// print fibonacci series
	public void fibonacciS() {
		int next;
		int i = 0;
		int first = 0;
		int second = 1;
		System.out.println("the fibonacci series upto 10 numbers is");
		do {
			System.out.println(first);
			next = first + second;
			first = second;
			second = next;
			i++;

		}

		while (i <= 10);
	}

	public static void main(String[] args) {
		DoWhile4 dw4 = new DoWhile4();
		dw4.fibonacciS();
	}

}
