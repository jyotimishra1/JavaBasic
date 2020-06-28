package basics;

//File Name: Singleton.java
public class Singleton2 {

private static Singleton2 sin;
private Singleton2(){}
public static Singleton2 getSin()
{
	if(sin==null)
	{
		synchronized(Singleton2.class)
		{
			if(sin==null){
			}
			sin=new Singleton2();
			}

		}
	return sin;
	}
	

public static void main(String[] args) {
	Singleton2 sn=Singleton2.getSin();
	
}
}
