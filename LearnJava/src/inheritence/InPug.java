package inheritence;

public class InPug extends InDog {
	String size = "large";
	int age = 8;

	public void eat() {
		System.out.println("pug eats eggs");
	}

	public void sleep() {
		System.out.println("pug sleeps");
	}

	public void walk() {
		System.out.println("pugs walks fast");
	}

	public void licks() {
		System.out.println("pug licks ice cream");
	}
}
