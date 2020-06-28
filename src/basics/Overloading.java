package basics;

public class Overloading {
    public void m3(int a)
    {
        System.out.println("int m3");
    }
    public void m3(long a)
    {
        System.out.println("long m3");
    }
    public void m3(double a)
    {
        System.out.println("double  m3");
    }

    public void m3(float a)
    {
        System.out.println("float  m3");
    }
    public void m3(String a)
    {
        System.out.println("String  m3");
    }

    /*public void m3(Integer a)
    {
        System.out.println("Integer  m3");
    }*/
    public static void main(String[] args) {
        Overloading a=new Overloading();
        a.m3(12.0);
    }
}
