package constructor;

public class Child extends Parent {
	public Child() {
		super(12, "tom");
		System.out.println("i am child");
		
	}
	
	public Child sleep(Child obj)
	{
		System.out.println("child sleeps");
		return this;
	}

	public void eat(int items)
	{
		System.out.println("eat" + items + "bones");
	}
	public static void main(String[] args) {
		Child ch = new Child();
		ch.sleep(ch).eat(3); // method chaining
	}
}
