package threads;
public class TreadClass extends Thread{
static int i=0;
public static void main(String[] args) {
	TreadClass t=new TreadClass();
	t.start();
	
	TreadClass t1=new TreadClass();
	t1.start();
}
@Override
public void run()
{	System.out.println(Thread.currentThread().getName()
        + " in control");
	System.out.println("thread is rinning" +i++);
	}
}
