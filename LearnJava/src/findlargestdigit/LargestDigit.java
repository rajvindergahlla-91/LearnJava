package findlargestdigit;

public class LargestDigit {
	int digit;
	int largest = 0;
	int i = 0;

	public void findLargest(int num) {
		while (num > 0) {
			digit = num % 10;
			if (digit > largest) {
				largest = digit;
			}
			num = num / 10;
			i++;
		}
		System.out.println("the largest digit is" + largest);
	}

	public static void main(String[] args) {
		LargestDigit ld = new LargestDigit();
		ld.findLargest(77865);
	}

}
