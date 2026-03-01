package nestedifelseblock;

public class Example2 {
	// ATM Withdrawal Check
	//A user wants to withdraw money.
	//Conditions:
	//If account balance ≥ withdrawal amount
	//If withdrawal amount ≤ daily limit → “Transaction Successful”
	//Else → “Daily limit exceeded”
	//Else → “Insufficient balance”
	public void withdraw(int ab,int wa,int dl)
	{
		if(ab>=wa)
		{
			String message= wa<=dl?"Transaction Successful":"Daily Limit Exceeded";
			System.out.println(message);//ternary operator
			/*
			 * if(wa<=dl) { System.out.println("Transaction Successful"); } else {
			 * System.out.println("Daily Limit Exceeded"); }
			 */
			
		}
		else {
			System.out.println("Insufficient balance");
		}
	}

	public static void main(String[] args)
	{
		Example2 ie = new Example2();
		ie.withdraw(500,90,100);
	}
}
