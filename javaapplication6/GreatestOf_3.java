
package javaapplication6;

import java.util.Scanner;

public class GreatestOf_3 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a);
            System.exit(0);
        }
        if(b>a && b>c)
        {
            System.out.println(b);
            System.exit(0);
        }
        System.out.println(c);
            
    }
}
