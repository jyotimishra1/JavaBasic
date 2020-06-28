package threads;

public class RunableThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running the thred");
	}
public static void main(String[] args) {
	RunableThread r=new RunableThread();
	Thread t=new Thread(new RunableThread());
	t.start();
}
}
