package threads.MultiThreading;

public class DisplayClass {
    public synchronized  void displya(String s) {
       for(int i=0;i<3;i++) {
           System.out.print("Welcome : ");
           try {
               Thread.sleep(2000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println(s);
       }
    }
}
