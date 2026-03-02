package forloop;

public class Ex5 {
//	Print Numbers with Conditions
//	Write a program that:
//	Uses a for loop from 1 to 25
//	If number is divisible by 5 → print "Multiple of 5: <number>"
//	Else → print the number normally

	public void printNumber(int num) {
		for (int i = 1; i <= 25; i++) {

			if (num % 5 == 0) {
				System.out.println(" Multiple of 5");
			} else {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {
		Ex5 pn = new Ex5();
		pn.printNumber(23);
	}
}
