package threads.MultiThreading;


class ThreadClass {
    // A simple recursive program to find
    // n'th fibonacci number
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    // Returns number of ways to reach s'th stair
    static int countWays(int s,int m)
    {
        int a = fib(s + 1);
        if(a%m==0){
            return fib(s + 1);
        } else {
            return 0;
        }

    }

    /* Driver program to test above function */
    public static void main(String args[])
    {
        int s = 10;
        System.out.println("Number of ways = " + countWays(s,2));
    }
}