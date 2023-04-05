
package javaapplication6;
import java.util.Scanner;


public class QuadraticEquation {
    
    public  void Quad(double a,double b,double c)
    {
        double d,r1,r2;
        if(a==0)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        d= b*b -(4*a*c);
        if(d==0)
        {
            System.out.println("Equal and real roots");
            r1=r2=-b/(2*a);
            System.out.println("root1 = "+r1+" root2 = "+r2);
        }
        else if(d>0)
        {
            System.out.println("Roots are real and distinct");
            r1 = (-b + Math.sqrt(d))/(2*a);
            r2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("root1 = "+r1+" root2 = "+r2);
        }
        else
            System.out.println("Imaginary roots");
    }
 
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        double a,,b,c;
        System.out.println("Enter a,b and c");
        a = sc.nextDouble();
        b= sc.nextDouble();
        c= sc.nextDouble();
        QuadraticEquation q = new QuadraticEquation();
        q.Quad(a,b,c);
        
    }
    
}
