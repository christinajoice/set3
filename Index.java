import java.io.*;
import java.util.*;
public class Index
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n;
int a[]=new int[30];;
System.out.println("Enter the number of elements");
n=s.nextInt();
System.out.println("Enter the elements");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("Elements index");
for(int i=0;i<n;i++)
{
System.out.println(a[i]+"\t"+i);
}
}
}
