package accessmodifier;

public class FinalExam extends Exam {
	private int dig;
	
	private void mathsScore()
	{
		System.out.println(" i am passed");

	}

	public static void main(String[] args)
	{
		Exam ex = new Exam();
		ex.getMarks();
		System.out.println(ex.num);
		FinalExam fe = new FinalExam();
		fe.getMarks();
		System.out.println(fe.num);
	}
}
