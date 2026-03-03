package dowhile;

public class DoWhile5 {
	// check if number is prime

	public void checkprime(int num)

	{
		if (num <= 1) {
			System.out.println(" not a prime number");

		}
		int i = 2;

		boolean isprime = true;
		do {
			if (num % i == 0) {

				isprime = false;
				break;
			}
			i++;
		} while (i < num);

		if (isprime) {
			System.out.println("prime number");
		} else {
			System.out.println("not a prime number");
		}
	}

	public static void main(String[] args) {

		DoWhile5 dw = new DoWhile5();
		dw.checkprime(21);
	}
}
