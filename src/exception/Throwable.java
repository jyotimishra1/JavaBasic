package exception;

import java.io.IOException;
/*Can we catch Throwable.: Noooo
catch(Throwable t)
throw new Throwable();
get complie time error like (No exception of Throwable can be thrown. An exception type is  must of subclass of Throwable*/
public class Throwable {
	public static void main(String[] args){
		try{
			System.out.println("hi");
			}
			/*catch(Exception t)
			{
				//throw new ClassCastException();
				throw new Throwable();
			}*/
		catch(Exception t)
		{
			//throw new ClassCastException();
			
		}
	}
}
