
package javaapplication6;

import java.util.Scanner;

public class Factorial {
    public static void  main(String[] args)
    {
        int p=1;
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n=s.nextInt();
        if(n==0 || n==1)
        {
            System.out.println(n);
            System.exit(0);
        }
        for(int i=n;i>=2;i--)
        {
            p*=i;
        }
        System.out.println(p+" is the factorial of "+n);
    }
}
