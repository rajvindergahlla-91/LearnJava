package practicework;

public class Occurence {
	int digit;

	public void occurenceOfDigits(int num, int target) {
		int i = 0;
		while (i<num) {
			digit = num % 10;
			num = num / 10;

			if (digit == target)
				
			{
				i++;
			}
		}
		System.out.println(" the occurence of" + target + "is" + i);
	}

	public static void main(String[] args) {
		Occurence oc = new Occurence();
		oc.occurenceOfDigits(1334333, 3);
	}

}
