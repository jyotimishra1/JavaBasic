package basics;

public class cloneObject implements Cloneable{
private int c;
private int d;
public cloneObject(int c,int d) {
	this.c=c;
	this.d=d;
}
public static void main(String[] args) {
	cloneObject c = null;
	cloneObject c2=new cloneObject(2, 9);
	try {
		c=(cloneObject) c2.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(c.hashCode());
	System.out.println(c2.hashCode());
	System.out.println(c.getClass());
	cloneObject c3=new cloneObject(2, 9);
	try {
		c.finalize();
		System.out.println("eee");
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	int b=c3.c;
	System.out.println(b);
}
//The java.lang.Object.finalize() is called by the garbage collector on an object 
//when garbage collection determines that there are no more references to the object. 
//A subclass overrides the finalize method to dispose of system resources or to perform 
//other cleanup.
@Override
	protected void finalize() throws Throwable {
	System.out.println("finalizess");
	}
}
