package basics;

public class Test1 extends Test {
    public  void m1()
    {
        System.out.println("Test1 static subclass m1");
    }

    public void m2()
    {
        System.out.println("Test subclass m2");
    }
    public void m3(Integer a)
    {
        System.out.println("Integer  m3");
    }
    public void m3(String a)
    {
        System.out.println("String subclass m3");
    }

    public void m4(String a)
    {
        System.out.println("String subclass m4");
    }
    public static void main(String[] args) {
        /*Test t=new Test1();
        t.m1();
        Test1 t1=new Test1();
        t1.m1();*/

        Test t2=new Test1();
        t2.m2();
        Test t3=new Test();
        t3.m2();
        Test t4=new Test1();
        t4.m3(null);
        Test t5=new Test();
        t5.m3(null);
    }
}
