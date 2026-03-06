package overloadoverride;

public class TestVehicles {
	public static void main(String[] args)
	{
Vehicle vobj=new Car();
vobj.distance("distance",10);
//vobj.distance(10,"distance");
}
}