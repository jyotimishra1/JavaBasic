package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class test {
	public static void main(String[] args) {
		try{
			System.out.println("try block");
/*			int a=10;
			int  b=a/0;
			System.out.println("value of b "+b);*/
			String s=null;
			int a=s.length();
			FileInputStream i=new FileInputStream("");
		}
		catch(ArithmeticException ex)
		{
			System.out.println("catch  ArithmeticException exception");
		}
		catch(NullPointerException ex)
		{
			System.out.println("catch  NullPointerException exception");
		}
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception ex)
		{
			System.out.println("catch exception");
		}
		finally {
			System.out.println("finally");
		}
		
		
	}
	
}
