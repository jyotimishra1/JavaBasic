package basics;

public class InstanceOf {
 
	public static void main(String[] args) throws ClassNotFoundException {
		InstanceOf i=new InstanceOf();
		boolean b=i instanceof InstanceOf;
		System.out.println(b);
		//we know the class name here 
		System.out.println(i instanceof InstanceOf);
		
		//but if object is created at run time
		boolean b1=Class.forName("basics.cloneObject").isInstance(i);
		System.out.println(b1);
		// @formatter:on

	}
}
