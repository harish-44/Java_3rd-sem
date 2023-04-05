
package javaapplication6;


public class pattern {
    public static void main(String[] args)
    {
        int n=1234;
        int r,t=0;
        while(n!=0)
        {
            r = n%10;
            t=(t*10)+r;
            n/=10;
        }
        System.out.println(t);
    }
}
