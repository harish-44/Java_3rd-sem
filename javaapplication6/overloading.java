
package javaapplication6;

class Box
{
    int l,b,h;
    Box(int l,int b,int h)
    {
        this.l=l;
        this.b=b;
        this.h=h;
    }
    Box(int a)
    {
        l=b=h=a;
    }
    Box()
    {
        l=b=h=0;
    }
    void volume()
    {
        System.out.println("volume: "+(l*b*h));
    }
}
public class overloading {
    
    static void area(int l,int b)
    {
        System.out.println("Srea of rectangle is "+(l*b));
    }
    static void area(int a)
    {
        System.out.println("Area of square is "+(a*a));
    }
    static void area(double r)
    {
        System.out.println("Area of circle is "+(Math.PI * r*r));
    }
    static void area(double b, double h)
    {
        System.out.println("Area of triangle is "+(0.5*b*h));
    }
    public static void main(String[] args)
    {
        Box b1 = new Box(10,20,30);
        Box b2 = new Box(10);
        Box b3 =  new Box();
        b1.volume();
        b2.volume();
        b3.volume();
        area(10,20);
        area(10);
        area(10.0);
        area(10.0,20.0);
    }
}
