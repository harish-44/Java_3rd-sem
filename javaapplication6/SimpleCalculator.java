
package javaapplication6;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter your choice (add/sub/mul/div)");
        String choice = sc.next();
        choice = choice.toLowerCase();
        switch(choice)
        {
            case "add":
                System.out.println(a+"+"+b+"="+(a+b));
                break;
            case "sub":
                System.out.println(a+"-"+b+"="+(a-b));
                break;
            case "mul":
                System.out.println(a+"*"+b+"="+(a*b));
                break;
            case "div":
                System.out.println(a+"/"+b+"="+(a/b));
                break;
            default:
                System.out.println("Not a valid choice");
        }
    }
}
