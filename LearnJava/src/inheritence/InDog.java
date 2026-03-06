package inheritence;

public class InDog extends InAnimal {
	String breed = "pug";
	int legs = 4;

	public void bark() {
		System.out.println("dog barks");
	}

	public void eat() {
		System.out.println("dog eats bone");
	}

	public void sleep() {
		System.out.println("dog sleeps during day");
	}

	public void walk() {
		System.out.println("dogs walks very gently");
	}
}
