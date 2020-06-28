public class Test {
    public static void main(String[] args) {
        char r='z';
        int i=(int)r;
        String a="abcd efgh ijkl";

        String []s=a.split(" ");
        String []b= new String[s.length];

        for (int x=0;x<s.length;x++) {
            String a1 = "";
            int add=s[x].length()-1;
            for (int k = 0; k < s[x].length(); k++) {

                a1 = a1 + (char) ((int) s[x].charAt(k) + add);
                add--;
            }
            b[x]=a1;
        }
        String f1="";
        for(String d:b)
        {
            f1=f1+d+" ";
        }
        System.out.println(f1);
    }
    final public void h(){}
   // public void final h(){}
    //public modifier void h(){}
    public static final void h1(){}

}

