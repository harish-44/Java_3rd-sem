
package javaapplication6;

import java.util.Scanner;

public class primeNo {
    static boolean pcheck(int n)
    {
        if(n==0 || n==1)
            return false;
        for(int i=2;i<n;i++)
        {
            if(n%2 == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        if(pcheck(n))
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}
