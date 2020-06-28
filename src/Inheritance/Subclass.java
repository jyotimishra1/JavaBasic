package Inheritance;

public class Subclass extends SuperClass implements InterfaceClass{
	private int c;
/*	@Override
	public String toString() {
		return "Subclass [c=" + c + ", d=" + d + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}*/
	private int d;
public Subclass(int c,int d) {
	super(20,21);
	this.c=c;
	this.d=d;
}
static public void s1()
{
	 System.out.println("subclass class static method");
}
public static void main(String[] args) {
	/*System.out.println("hi");
	Subclass s=new Subclass(1, 2);
	SuperClass sc=new SuperClass(30, 10);
	SuperClass sc1=new Subclass(11,22);
	sc1.sm1();*/
/*	InterfaceClass i=null;
	Subclass s1=null;
	Subclass s=new Subclass(1, 2);
	System.out.println(i);
	System.out.println(s);
	System.out.println(s1);*/
	SuperClass p=new Subclass(1, 2);
	p.s1();

			
}
void m1()
{
	 System.out.println("sub class class m()");

}
void m2()
{
	 System.out.println("sub class class m2()");

}
void sm1()
{
	 System.out.println("sub class class sm1()");
}


public void m4() {
	// TODO Auto-generated method stub
	
}

@Override
public void I1() {
	// TODO Auto-generated method stub
	
}

@Override
public void I2() {
	// TODO Auto-generated method stub
	
}
}
