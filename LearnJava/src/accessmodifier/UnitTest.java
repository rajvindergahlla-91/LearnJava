package accessmodifier;

public class UnitTest {
	private int num1;
	private void scoring()
	{
	System.out.println("scoring is good");
	}
	public static void main(String[] args)
	{
		Exam ex = new Exam();
		ex.getMarks();
		System.out.println(ex.num);

	}

}
