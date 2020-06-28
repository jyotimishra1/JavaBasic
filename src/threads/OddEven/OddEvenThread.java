package threads.OddEven;

public class OddEvenThread extends Thread{
    private int max;
    private Printer print;
    private boolean isEvenNumber;

    public OddEvenThread(Printer print, int i, boolean b) {
        this.print=print;
        this.max=i;
        this.isEvenNumber=b;
    }

    // standard constructors

    @Override
    public void run() {
        int number = isEvenNumber ? 2 : 1;
        while (number <= max) {
            if (isEvenNumber) {
                print.printEven(number);
            } else {
                print.printOdd(number);
            }
            number += 2;
        }
    }

    public static void main(String... args) {
        Printer print = new Printer();
        Thread t1 = new Thread(new OddEvenThread(print, 10, false),"Odd");
        Thread t2 = new Thread(new OddEvenThread(print, 10, true),"Even");
        t1.start();
        t2.start();
    }
}
