
package javaapplication6;

import java.util.Scanner;
public class secondlarg {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=s.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j+1]<a[j])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
        int x=0,m;
        m=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]>m)
            {
                x=m;
                m=a[i];
            }
        }
        System.out.println("\n"+x);
    }
}
