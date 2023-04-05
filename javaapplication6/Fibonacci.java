
package javaapplication6;
import java.util.Scanner;
public class Fibonacci {
    static void fib(int n)
    {
        if(n==1 || n==0)
            System.out.println(1);
        else
        {
            int a=0,b=1;
            System.out.print(a+"\t"+b+"\t");
            for(int i=1;i<=n-2;i++)
            {
                int c=a+b;
                a=b;
                b=c;
                System.out.print(c+"\t");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        fib(n);
    }
}
