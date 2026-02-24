package hwcalci;

public class HwCalculator {
	public void addTwo(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("sum of two numbers is:" + sum);
	}

	public void addThree(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		System.out.println("sum of three numbers is:" + sum);
	}

	public void minusTwo(int num1, int num2) {

		int diff = num1 - num2;
		System.out.println("difference of two numbers is:" + diff);
	}
	public void minusThree(int num1, int num2,int num3) {

		int diff = num1 - num2-num3;
		System.out.println("difference of three numbers is:" + diff);
	}

	public void multiply(int num1, int num2, String msg) {
		int multi = num1 * num2;
		System.out.println(msg + multi);
	}

	public void divide(int num1, int num2, String msg) {
		int div = num1 / num2;
		System.out.println(msg + div);
	}
}
