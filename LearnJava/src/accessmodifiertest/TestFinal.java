package accessmodifiertest;

import accessmodifier.Exam;

 public class TestFinal extends Exam
{
	public TestFinal()
	{
		super();
		System.out.println(" calling testfinal constructor");
	}
	public static void main(String[] args)
	{
		TestFinal tf = new TestFinal();

	}
}

