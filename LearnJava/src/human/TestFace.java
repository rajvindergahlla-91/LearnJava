package human;

public class TestFace {
	String testing = "two";

	public static void main(String[] args) {
		
		
		  TestFace tf=new TestFace(); 
		  tf.testing="three";
		  System.out.println(tf.testing);
		 
		Face fc = new Face();
		  
		System.out.println(fc.eyes);
		fc.smile();
		Face.blink();
		System.out.println(fc.ant);
		System.out.println(Face.noOfEyes);
	}

}
