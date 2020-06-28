package Interview;

public class StringReversal {
    public static void main(String arg[])
    {
        String s="cbf";
        String revers="";
       for(int i=s.length()-1;i>=0;i--)
        {
            revers=revers+s.charAt(i);
        }
        System.out.println(revers);
    }
}
