package nestedifelseblock;

public class Example1 {
	// Student Result System
	// Write a program that:
	// Takes marks (0–100)
	// If marks ≥ 40 → student passes
	// If marks ≥ 75 → print “Distinction”
	// Else → print “Pass”
	// Else → print “Fail”

	public void studentMarks(int marks) {

		if (marks <= 100) {

			if (marks >= 40) {

				String output = marks >= 75 ? "distinction" : "pass";//ternary operator

				System.out.println(output);
				/*
				 * if (marks >= 75) { System.out.println("Distinction"); } else {
				 * System.out.println("pass"); }
				 */

			} else {
				System.out.println("fail");
			}
		}

		else {
			System.out.println("invalid data");
		}
	}

	public static void main(String[] args) {
		Example1 ie = new Example1();
		ie.studentMarks(100);

	}

}
