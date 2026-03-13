package accessmodifiertest;

import accessmodifier.Exam;

public class TestUnit {
	public TestUnit() {
		System.out.println(" calling testunit constructor");
	}

	public static void main(String[] args) {
		TestUnit tu = new TestUnit();
		Exam ex = new Exam();
	}

}
