
package javaapplication6;


public class reverse_array {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5};
        int j=0;
        int [] b=new int[a.length];
        for(int i=a.length-1;i>=0;i--)
        {
            b[j]=a[i];
            j++;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(b[i]+"\t");
        }
    }
}
