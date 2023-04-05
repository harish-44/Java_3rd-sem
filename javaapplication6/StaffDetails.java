
package javaapplication6;

import java.util.Scanner;
class Staff
{
    String Sid,name,phno,salary;
    Scanner s = new Scanner(System.in);
    void read()
    {
        System.out.println("Enter the id,name,phno and salary");
        Sid = s.next();
        name=s.next();
        phno=s.next();
        salary = s.next();
    }
    void display()
    {
        System.out.print(Sid+"\t"+name+"\t"+phno+"\t"+salary);
    }
}
class Teaching extends Staff
{
    String domain,publication;
    Scanner s = new Scanner(System.in);
    void read()
    {
        super.read();
        System.out.println("Enter domain and publication");
        domain=s.next();
        publication=s.next();
    }
    void display()
    {
        super.display();
        System.out.println("\t"+domain+"\t"+publication);
    }
}
class Technical extends Staff
{
    String skills;
    void read()
    {
        super.read();
        System.out.println("Enter skill");
        skills=s.next();
    }
    void display()
    {
        super.display();
        System.out.print(skills);
    }
}
class Contract extends Staff
{
    String period;
    void read()
    {
        super.read();
        System.out.println("Enter period");
        period=s.next();
    }
    void display()
    {
        super.display();
        System.out.print("\t"+"period");
    }
}
public class StaffDetails {
    public static void main(String[] args)
    {
    Teaching t[] =new Teaching[3];
    Technical th[] = new Technical[3];
    Contract c[]= new Contract[3];
    int i;
    System.out.println("Teaching");
    for(i=0;i<3;i++)
    {
        t[i] =new Teaching();
        t[i].read();
    }
    System.out.println("Technical Staff");
    for(i=0;i<3;i++)
    {
      th[i] = new Technical();
      th[i].read();
    }
    System.out.println("Contrac Staff");

    for(i=0;i<3;i++)
    {
        c[i]=new Contract();
        c[i].read();
    }
    System.out.println("Staff Details");
    System.out.println("Teaching");
    for(i=0;i<3;i++)
        t[i].display();
    System.out.println("Technical Staff");
    for(i=0;i<3;i++)
        th[i].display();
    System.out.println("Contrac Staff");
    for(i=0;i<3;i++)
        c[i].display();
    }
}
