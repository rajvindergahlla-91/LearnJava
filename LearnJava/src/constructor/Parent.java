package constructor;

public class Parent {
	String topic;
	
	public Parent()
	{
		System.out.println(" i am the parent");
	}
	public Parent(String tp)
	{
		topic= tp;
	
		System.out.println("the topic is "+ tp);
	}
	public Parent(int num, String cons)
	{
		System.out.println(" the number is" + num + cons);
	}
public static void main(String[] args)
{
	Parent c = new Parent("constructor");
	Parent c1= new Parent(12,"construct");
	System.out.println(c.topic);

}
}
