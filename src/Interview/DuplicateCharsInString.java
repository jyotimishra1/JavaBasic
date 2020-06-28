package Interview;
//compare each element of string to the each value in character of string
public class DuplicateCharsInString {
    public static void main(String arg[])
    {
        String str="abcdsb";
        char[] chr=str.toCharArray();
        System.out.println(+str.charAt(1));
        for (int i=0;i<str.length()-1;i++)
        {   int count=0;
            for(int j=0;j<str.length()-1;j++)
            {
                if(chr[i]==chr[j] )
                {
                    count++;
                    System.out.println(+str.charAt(i)+" occured = " +count);

                }
            }
        }
    }
}
