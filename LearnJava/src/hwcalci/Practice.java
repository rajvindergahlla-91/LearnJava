package hwcalci;

public class Practice {

	byte num1 = 67;
	short num2 = 55;
	int sum = num1 + num2;
	long num = 6675859659686l;
	char ch = 'y';
	char ch1 = 98;
	char ch3 = '6';
	static boolean correct = true;
	static boolean verified;

	public static void main(String[] args) {
		Practice pr = new Practice();

		System.out.println(pr.sum);
		System.out.println(pr.num);
		System.out.println(pr.ch);
		System.out.println(pr.ch1);
		System.out.println(pr.ch3);
		System.out.println(correct);
		System.out.println(verified);

		pr.difference(2.98f, 7.76f);

		pr.division(67.876453, 98.534645, "division result is");

	}

	public void difference(float n1, float n2) {
		float minus = n1 - n2;
		System.out.println(minus);
	}

	public void division(double n1, double n2, String msg) {
		double div = n1 / n2;
		System.out.println(msg + div);
	}
}
