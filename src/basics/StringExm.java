package basics;

import javax.swing.Spring;

public class StringExm {
	int a;
	int b;
	StringExm(int a,int b){
		this.a=a;
		this.b=b;
	}
 public static void main(String[] args){
	 /*String sl="rr";
		String sl1="rr";
		System.out.println(sl.equals(sl1));
		System.out.println(sl==sl1);
		StringExm sp=new StringExm(1,2);
		StringExm sp1=new StringExm(1,2);
		System.out.println(sp.equals(sp1));
		System.out.println(sp==sp1);
		String s=new String("abc");
		String s1=new String("abc");
		System.out.println(s.equals(s1));
		System.out.println(s==s1);*/
	 
	 /*StringExm sp=new StringExm(1,2);
		StringExm sp1=new StringExm(1,3);
		System.out.println(sp==sp1);
		System.out.println(sp.a==sp1.a);

		System.out.println(sp.b==sp1.b);*/

	 	String s=new String("abc");
	 	String sl="abc";
	 	String sl1="abc";
	 	System.out.println(s==sl);
	 	System.out.println(s.equals(sl));
}
}
