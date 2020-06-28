package exception;

public class Test1 {
	public int m1(){
		try {
			int a=10;
			int b=a/0;
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch block");
			return 2;
		}finally {
			System.out.println("finally block");
			return 3;
		}
		//return 3;
		//System.out.println("test");
		
	}
	public static void main(String[] args) {
		Test1 t=new Test1();
		int a=t.m1();
		System.out.println("return value is "+a);
	}
}
