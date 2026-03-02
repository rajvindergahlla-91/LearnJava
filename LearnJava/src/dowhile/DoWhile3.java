package dowhile;

public class DoWhile3 {
//	Asks user to enter a password
//	If password is wrong → show "Try again"
//	If correct → show "Access granted"
//	Use do-while
	//String enteredp;
	String correctp = "raj123";

	public void loginPage(String enteredp)

	{
		do {
			System.out.println(" enter the password");

			if (enteredp == correctp)

				System.out.println("Access granted");

			else
				System.out.println("try again");
			break;

		} while (enteredp != correctp);

	}

	public static void main(String[] args) {
		DoWhile3 dw3 = new DoWhile3();
		dw3.loginPage("raj");
	}
}
