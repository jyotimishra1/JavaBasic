package basics;

public class ObjectClassTest implements Cloneable {
	private int a;
	ObjectClassTest(int a){
		this.a=a;
	}
public static void main(String jj[])
{
	ObjectClassTest t=new ObjectClassTest(2);
	ObjectClassTest t1=new ObjectClassTest(2);
	ObjectClassTest t2=t1;
	System.out.println("equels() method check =============");
System.out.println("equels method check btw t and t1 : "+t.equals(t1));
System.out.println("equels method check btw t1 t2 : "+t1.equals(t2));
System.out.println("equels() method check =============");
System.out.println(t.hashCode());
System.out.println(t1.hashCode());
System.out.println(t2.hashCode());
t2.a=5;
System.out.println(t1.a);
System.out.println(t2.a);
System.out.println("clone() method check =============");
//The class must also implement java.lang.Cloneable interface whose object clone we want to create otherwise it will throw CloneNotSupportedException when clone method is called on that class’s object.
ObjectClassTest t3 = null;

	try {
		t3=(ObjectClassTest) t.clone();
		System.out.println(t.hashCode());
		System.out.println(t3.hashCode());
		System.out.println(t3.a);
		t3.a=10;
		System.out.println(t.a);
		System.out.println(t3.a);
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
