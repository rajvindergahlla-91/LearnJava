package practicework;

public class Fibbo {
	int first = 0;
	int second = 1;
	int next;

	public void fseries() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(" Fibbonacci series is " + first);

			next = first + second;
			first = second;
			second = next;

		}

	}

	public static void main(String[] args) {
		Fibbo fb = new Fibbo();
		fb.fseries();
	}
}
