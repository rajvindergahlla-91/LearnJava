package palidrome;

public class Palidrome {
	int reverse = 0;
	int digit;
	int i = 0;

	public void checkPalidrome(int num) {
		int original=num;
		
		while (num > 0) {
			digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
			i++;

		}
		if (reverse == original) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}


	}

	public static void main(String[] args) {
		Palidrome p = new Palidrome();
		p.checkPalidrome(12233220);
	}

}
