
package javaapplication6;

import java.util.Random;

class Square implements Runnable
{
    int x;
    Thread t;
    public Square(int n)
    {
        x=n;
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        System.out.println("Square of "+x+" is "+(x*x));
    }
}
class Cube implements Runnable
{
    int x;
    Thread t;
    public Cube(int n)
    {
        x=n;
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        System.out.println("Cube of "+x+" is "+(x*x*x));
    }
}
class Generator implements Runnable
{
    Thread t;
    Random r =new Random();
    public Generator()
    {
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        while(true){
        int num = r.nextInt(100);
        System.out.println("Generated number is "+num);
        Square s=new Square(num);
        Cube c=new Cube(num);
        try
        {
            t.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    }
}
public class OOPS8 {
    public static void main(String[] args)
    {
        Generator g= new Generator();
    }
}
