package nestedifelseblock;

public class Example3 {
	//Login Validation
	//You have:
	//username
	//password
	//Conditions:
	//If username is correct
	//If password is correct → “Login successful”
	//Else → “Wrong password”
	//Else → “Invalid username”
	
	/*
	 * String username; String password;
	 */
	public void  login(String username,String password)
	{
		if(username=="Raj")
		{
			String revert= password=="raj123"? "Login successful":"Wrong password";
			System.out.println(revert);
			/*
			 * if(password=="raj123") { System.out.println("Login successful"); } else {
			 * System.out.println("Wrong password"); }
			 */
		}
		else {
			System.out.println("Invalid Username");
		}
		
	}
	public static void main(String[] args)
	{
		Example3 ee = new Example3();
		ee.login("Raj","raj");
	}
}
