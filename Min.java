import java.io.*;
import java.util.*;
public class Min
{
public static void main(String args[])
{
int a[]=new int[10[;
int min;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of elements");
int N=s.nextInt();
System.out.println("Enter the elements");
for(int i=0;i<N;i++)
{
a[i]=s.nextInt();
}
min=a[0];
for(int i=0;i<N;i++)
{
if(min>a[i])
min=a[i];
}
System.out.println("Minimum element is"+min);
}
}
