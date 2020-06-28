package Interview;

import java.util.Arrays;

public class SecondLarge {
    public static void main(String arg[])
    {

        int a[]={0,10,1,4,5,3,2,6};

        Arrays.sort(a);
        for (int i:a) {
            System.out.println(i);
        }
        System.out.println("second lagest element "+a[a.length-2]);
    }
}
