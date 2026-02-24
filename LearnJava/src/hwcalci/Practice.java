package hwcalci;

public class Practice {
	
	static byte num1=67;
	static short num2=55;
	static int sum= num1+num2;

	
	public static void main(String[] args)
	{
		System.out.println(sum);
		Practice pr=new Practice();
		pr.difference(2,7);
	}
	public void difference(float n1,float n2) {
		float minus= n1-n2;
		System.out.println(minus);
	}
}

