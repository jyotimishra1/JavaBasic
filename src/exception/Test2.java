package exception;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        String s1="";
        try {
            Scanner s=new Scanner(System.in);
            System.out.println("enter string ");
             s1=s.nextLine();
            System.out.println("password is ");

        }
        finally {
            if(s1.length()<3)
                System.out.println("hi");
            else
                System.out.println("hello");
        }
    }
}
