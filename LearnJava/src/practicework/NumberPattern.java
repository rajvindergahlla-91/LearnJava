package practicework;

public class NumberPattern {       // palindrome
	int rows = 4;

	public void numPattern() {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (int s = 1; s <= i; s++) {
				System.out.print(s);
			}
			for (int s=i-1;s>=1;s--)
			{
				System.out.print(s);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		NumberPattern np = new NumberPattern();
		np.numPattern();
	}

}
