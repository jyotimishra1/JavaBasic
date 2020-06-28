package Interview;

public class NumberReverse {

    public static void main(String arg[])
    {
        int number=7643;
        int reverse=0;
        while(number!=0)
        {
            reverse=reverse*10+number%10;
            number=number/10;
        }
        System.out.println("reverse number: "+reverse);
    }
}
