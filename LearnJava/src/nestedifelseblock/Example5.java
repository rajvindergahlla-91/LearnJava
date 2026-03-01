package nestedifelseblock;

public class Example5 {
	//Shopping Discount System
	//If purchase amount ≥ $100
	//If customer is premium member → 20% discount
	//Else → 10% discount
	//Else → No discount
	
	boolean pm;
	public void applyDiscount(int amt, boolean pm)
	{
		if(amt>=100)
		{
			String coupon= pm==true?"20% discount":"10% discount";
			System.out.println(coupon);
//			if(pm)
//			{
//				System.out.println("20% discount");
//			}
//			else
//			{
//				System.out.println("10% discount");
//			}
		}
		else
		{
			System.out.println("No discount");
		}
	}
public static void main(String[] args)
{
	Example5 ie = new Example5();
	ie.applyDiscount(187,ie.pm);
	
}
}
