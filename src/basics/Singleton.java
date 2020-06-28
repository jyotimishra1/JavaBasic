package basics;

//File Name: Singleton.java
public class Singleton {

private static  Singleton singleton;

/* A private Constructor prevents any other
 * class from instantiating.
 */
private Singleton() {
	//getInstance( );
}

/* Static 'instance' method */
/*public static Singleton getInstance( ) {
	System.out.println("getInstance get called");
      return singleton;
}*/

public static Singleton getInstanceUsingDoubleLocking(){
    if(singleton == null){
        synchronized (Singleton.class) {
            if(singleton == null){
            	singleton = new Singleton();
            }
        }
    }
    return singleton;
}
static{
	singleton=new Singleton();
}

void m1()
{
	System.out.println("M1 called");}
public static void main(String[] args) {
	Singleton s=new Singleton();
	System.out.println(s.hashCode());
    Singleton tmp = Singleton.getInstanceUsingDoubleLocking( );
    System.out.println(tmp.hashCode());
/*    Singleton tmp1 = Singleton.getInstance( );
    System.out.println(tmp1.hashCode());*/
    /*System.out.println(tmp1.hashCode());
    tmp.demoMethod( );*/
 }
}
