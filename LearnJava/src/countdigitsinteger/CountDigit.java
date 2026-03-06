package countdigitsinteger;

public class CountDigit {

	int count = 0;

	public void counting(int num) {
		if(num==0)
		{
			System.out.println(" the number of digits is 1");
			return;
		}
		while (num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println("the number of digits is" + count);

	}

	public static void main(String[] args) {
		CountDigit cd = new CountDigit();
		cd.counting(+7897688);
	}

}
