package practicework;

public class Palindrome {
	int digit;
	int reverse = 0;

	public void findPalindrome(int num)

	{
		int original = num;
		while (num > 0) {
			digit = num % 10;
			reverse = reverse * 10 + digit;

			num = num / 10;
		}
		if (reverse == original) {
			System.out.println(" Its a Palindrome");
		} else {
			System.out.println("Its Not a Palindrome");
		}
	}

	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		p.findPalindrome(1234321);
	}
}
