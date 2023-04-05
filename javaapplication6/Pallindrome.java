
package javaapplication6;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int r,sum=0;
        int t=n;
        while(n!=0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n/=10;
        }
        if(sum==t)
            System.out.println("It is a pallindrome");
        else
            System.out.println("Not a pallindrome");
    }
}
