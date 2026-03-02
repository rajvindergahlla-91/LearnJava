package dowhile;

public class DoWhile1 {
//	Uses a do-while loop
//	Prints numbers from 1 to 10
int i;
	public void print() {
		//int i=0;
		do {
			System.out.println("number" + i);
			i++;
		} while (i <= 10);

	}

	public static void main(String[] args) {
		DoWhile1 dw = new DoWhile1();
		dw.print();
	}
}
