package Interview;

public class SumofNumber {
    public static void main(String arg[])
    {
        int a[]={1,2,3,4,5,6};
        int lagestsNumber=a[a.length-1];
        int sum=lagestsNumber*(lagestsNumber+1)/2;
        System.out.println(sum);
    }
}
