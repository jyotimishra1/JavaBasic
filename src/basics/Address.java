package basics;

public class Address {
  private int a1;
 private int a2;
public Address(int a1, int a2) {
	super();
	this.a1 = a1;
	this.a2 = a2;
	System.out.println("address constructor");
}
public int getA1() {
	return a1;
}
/*public void setA1(int a1) {
	this.a1 = a1;
}*/
public int getA2() {
	return a2;
}
/*public void setA2(int a2) {
	this.a2 = a2;
}*/
 
}
