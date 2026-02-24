package myprograms.basicprograms;

public class Dog {

	public static void main(String[] args) {
		Dog br = new Dog();
		br.bark();

	}

	public void bark() {
		System.out.println("dog barks");
		Animal.jump();
		Animal ani = new Animal();
		ani.walk();

		

	}

	public static void bite() {
		System.out.println("dog bites");

		Animal ani = new Animal();
		ani.walk();

	}

}
