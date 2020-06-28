package threads.EvenOddJoin;

import threads.TreadClass;

public class Printer {
    boolean  odd=true;
   synchronized void  printEven(int i) throws InterruptedException {
           System.out.println(TreadClass.currentThread() + " " + i);
           wait();
    }
    synchronized void printOdd(int i) throws InterruptedException {
       if(odd) {
           System.out.println(TreadClass.currentThread() + " " + i);
           odd=false;
           notify();
       }
        wait();
    }

}
