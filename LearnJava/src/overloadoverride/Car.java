package overloadoverride;

public class Car extends Vehicle{
	int wheels = 4;
	String color = "white";

	public void speed() {
		System.out.println("60km/hr");
	}

	public void speed(int s1) {
		System.out.println(s1);
	}

	public void speed(int s1, int s2) {
		System.out.println("can be " + s1 + "or" + s2);
	}

	public void distance(int d) {
		System.out.println("can cover" + d + "distance");

	}

	public void distance(int d, String dis) {
		System.out.println(dis + d);
	}


}
