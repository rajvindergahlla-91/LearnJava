package controlstatement;

public class IfElseBlock {
//static boolean itrains;

	public void myAction(boolean itrains, boolean sunday ) {
		if (itrains) {
			System.out.println("take a cab");
		} 
		if(sunday)
		{
			System.out.println(" its my holiday");
		}
		else {
			System.out.println("i will walk to the office");
		}
	}

	public static void main(String[] args) {
		boolean itrains= true;
		boolean sunday=false;
		IfElseBlock ie = new IfElseBlock();
		ie.myAction(itrains, sunday);

	}

}
