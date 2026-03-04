package reverse;

public class ReverseDigits {
	int a;
	int reverse = 0;

	public void reversing(int num) {
		while (num > 0) {

			a = num % 10;
			reverse = reverse * 10 + a;
			num = num / 10;

		}
		System.out.println("the reversed number is"+ reverse);
	}
	public static void main(String[] args)
	{
		ReverseDigits rd=new ReverseDigits();
		rd.reversing(56478);
	}

}