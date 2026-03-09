package practicework;

public class Diamond {
	int rows = 4;

	public void printUpDiamond() {
		for (int i = 1; i <= rows; i++) {
			for (int s = 1; s <= rows - i; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void printDownDiamond() {
		for (int i = rows -1; i >=  1; i--) {
			for (int s = 1; s <= rows - i; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Diamond d = new Diamond();
		d.printUpDiamond();
		d.printDownDiamond();
	}

}
