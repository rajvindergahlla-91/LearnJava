package forloop;

public class Ex1 {
//	 Find Sum of Even Numbers
//	 Write a program that:
//	 Uses a for loop from 1 to 50
//	 Inside loop:
//	 If number is even → add it to a variable var
//	 Print the final sum at the end
//	 👉 (Don’t add odd numbers.)
	int var = 0;

	public void addEven() {
		for (int i = 1; i <= 50; i++) {

			if (i % 2 == 0) {
				var = var + i;

			}
		}
		System.out.println("final sum" +" "+  var);
	}

	public static void main(String[] args) {
		Ex1 se = new Ex1();
		se.addEven();
	}

}
