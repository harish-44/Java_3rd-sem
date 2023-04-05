
package javaapplication6;
import java.util.Scanner;
interface Resum
{
    void bioData();
}
class Student implements Resum
{
    Scanner s = new Scanner(System.in);
    String name,usn,Class,sec;
    public Student()
    {
        System.out.println("Student Details");
        System.out.println("Enter name usn class and sec");
        name=s.next();
        usn = s.next();
        Class=s.next();
        sec=s.next();
    }
    public void bioData()
    {
     System.out.println(name+"\t"+usn+"\t"+Class+"\t"+sec);
    }
}
class Teacher implements Resum
{
    Scanner s=new Scanner(System.in);
    String name,email,phno,exp;
    public Teacher()
    {
        System.out.println("Teacher Details");
        System.out.println("Enter name email phno and exp");
        name=s.next();
        email=s.next();
        phno=s.next();
        exp=s.next();
    }
    public void bioData()
    {
        System.out.println(name+"\t"+email+"\t"+phno+"\t"+exp);
    }
}
public class Resume {
    public static void main(String[] args)
    {
        Resum r;
        r=new Teacher();
        r.bioData();
        r=new Student();
        r.bioData();
    }
}
