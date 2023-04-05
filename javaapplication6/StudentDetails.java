
package javaapplication6;
import java.util.Scanner;

public class StudentDetails {
    String USN,name,branch,ph;
    void read()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your USN name branch and phone number");
        USN = s.next();
        name = s.next();
        branch = s.next();
        ph = s.next();
    }
    void display()
    {
        System.out.println("USN\tName\tBranch\tphno");
        System.out.println(USN+"\t"+name+"\t"+branch+"\t"+ph);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = s.nextInt();
        StudentDetails stu[] = new StudentDetails[n];
        System.out.println("Enter the details");
        for(int i=0;i<n;i++)
        {
            stu[i] = new StudentDetails();
            stu[i].read();
        }
        for(int i=0;i<n;i++)
        {
            stu[i].display();
        }
    }
}
