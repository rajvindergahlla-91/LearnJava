package myprograms.basicprograms;

public class Animal {

	Animal ani;

	public static void sleep() {
		System.out.println(" animal sleeps");

		Animal ani = new Animal();
		ani.walk();

	}

	public void walk() {
		System.out.println(" animal walks");

	}

	public void eat() {
		System.out.println("animals eat");

	}

	public static void jump() {
		System.out.println("animal jumps");

	}

	public static void main(String[] args) {
		sleep();
		Animal bob = new Animal();
		bob.walk();

	}
}
