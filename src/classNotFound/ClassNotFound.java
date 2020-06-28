package classNotFound;

import java.net.NetworkInterface;

public class ClassNotFound {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		try {
			Object ob= Class.forName("classNotFound.RunTimeClass").newInstance();
			//if change as classNotFound.RunTimeClass1 ---ClassNotFoundException occur at runtime
			RunTimeClass t1=(RunTimeClass) ob;
			t1.m1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("class not found");
		}
	}

}
