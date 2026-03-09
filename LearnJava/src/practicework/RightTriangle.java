package practicework;

public class RightTriangle {
	int row = 4;

	public void printRightTriangle() {
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		RightTriangle rt = new RightTriangle();
		rt.printRightTriangle();
	}

}
