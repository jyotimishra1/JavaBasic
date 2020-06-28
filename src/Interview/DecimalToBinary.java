package Interview;

import java.util.ArrayList;
import java.util.List;

public class DecimalToBinary {
    public static void main(String ar[])
    {
        int number=25;
        List<Integer> binary=new ArrayList<Integer>();
        while(number>0)
        {
            binary.add(number%2);
            number=number/2;
        }
        System.out.println("binary no is :");
        for (int i=binary.size()-1;i>=0;i--) {

            System.out.println( binary.get(i));
        }
    }
}
