
package javaapplication6;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args)
    {
        int n1,n2,gcd=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        n1=s.nextInt();
        n2=s.nextInt();
        for(int i=1;i<=n1 && i<=n2;i++)
        {
            if(n1%i ==0 && n2%i==0)
            {
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
}
