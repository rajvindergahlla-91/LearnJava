package practicework;

public class GreatestDigit {
	int greatest = 0;
	int dig;
	int i = 0;

	public void findGreatest(int num) {

		while (num > 0) {
			dig = num % 10;

			if (dig > greatest) {
				greatest = dig;
			}
			num = num / 10;
			i++;

		}
		System.out.println(greatest);
	}
	public static void main(String[] args)
	{
		 GreatestDigit gd = new GreatestDigit();
		 gd.findGreatest(675489);
	}
}
