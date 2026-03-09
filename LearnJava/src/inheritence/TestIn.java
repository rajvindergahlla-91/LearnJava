package inheritence;

public class TestIn {
	public static void main(String[] args)
	{
		InAnimal ani= new InAnimal();
	ani.sound();
	InDog dg= new InDog();
	dg.sound();
	InPug pg=new InPug();
	pg.bark();
	InAnimal anobj = new InPug();
	anobj.sleep();
	anobj.eat();
	InDog dgobj=new InPug();
	dgobj.walk();
	dg.color= "black";
	System.out.println(dg.color);
	}
}

