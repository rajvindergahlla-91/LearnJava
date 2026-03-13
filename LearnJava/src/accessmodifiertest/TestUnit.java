package accessmodifiertest;

import accessmodifier.Exam;

public class TestUnit extends Exam {
	
	public static void main(String[] args) {

		TestUnit tu = new TestUnit();
		tu.getMarks();
		System.out.println(tu.num);
		Exam ex = new Exam();
		//ex.getMarks();
		//System.out.println(ex.num);
	}
}
