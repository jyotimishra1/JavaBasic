package Inheritance;

public class ReturnTypeChild extends ReturnTypeParent{
	/*int m1()
	{
		System.out.println("String return : inside parent m1()");
		return 0;
	}*/
	long m2()
	{
		System.out.println("Int return : inside parent m1()");
		return 1;
	}
	private void mai() {
		// TODO Auto-generated method stub
		ReturnTypeParent p=new ReturnTypeChild();
		
	}
}
