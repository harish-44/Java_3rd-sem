package javaapplication6;

import java.util.Scanner;

public class exception {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        System.out.println("Enter a and b");
        a = s.nextInt();
        b = s.nextInt();
        int[] d = new int[4];
        try {
            d[2] = 19;
            double c = a / b;
            System.out.println("c = " + c);

        } catch (ArithmeticException e) {
            System.out.println(e);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("End of Program");
    }
}
