package accessmodifier;

public class Exam {

	protected int num = 7;

	protected int getMarks() {

		System.out.println("My Marks are" + num);
		return num;
	}

}
