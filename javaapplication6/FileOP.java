
package javaapplication6;

import java.util.Scanner;
import java.io.*;
class FileDemo
{
    void p(String s)
    {
        System.out.println(s);
    }
    void analyze(String s)
    {
        File f = new File(s);
        if(f.exists())
        {
            p(f.getName()+" is the name of the file");
            p(f.canRead()?" is readable":" is not readable");
            p(f.canWrite()?"is Writable":" is not writable");
            p(f.length()+" is the length of file in bytes");
            p(f.lastModified()+" last modified");
        }
        else
            System.out.println("File does not exists");
    }
}
public class FileOP {
    public static void main(String[] args)
    {
        FileDemo fd = new FileDemo();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the path");
        String sc=s.nextLine();
        fd.analyze(sc);
    }
}