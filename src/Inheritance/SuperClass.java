package Inheritance;

public class SuperClass {
 protected int a;
 protected int b;
 String str;
public SuperClass(int i, int j) {
	this.a=i;
	this.b=j;
}
/* public SuperClass(int a, int b) {
	this.a=a;
	this.b=b;
}*/
 void sm1()
 {
	 System.out.println("super class sm1()");
 }
 void sm2()
 {
	 System.out.println("super class sm2()");
 }
 static public void s1()
 {
	 System.out.println("super class static method");
 }
}