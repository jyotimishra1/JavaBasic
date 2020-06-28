package Program;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j<n; j++) {
                System.out.print(" ");
            }

            for (int k = 1;k <= i; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
