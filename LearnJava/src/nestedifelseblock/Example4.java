package nestedifelseblock;

public class Example4 {
	//Age & ID Verification (Club Entry)
	//If age ≥ 18
	//If has ID → “Entry allowed”
	//Else → “ID required”
	//Else → “Underage”
	
	static boolean status ;
	
	public void entryAge(int age, boolean status)
	{
		if(age>=18)
		{
			String condition = status==true?"Entry allowed":"Id required";
			System.out.println(condition);
			/*
			 * if(status) { System.out.println("Entry allowed"); } else {
			 * System.out.println("Id Required"); }
			 */
		}
		else {
			System.out.println("Underage");
		}
	}
	public static void main(String[] args)
	{
		Example4 ie = new Example4();
		ie.entryAge(67,status);
	}

}
