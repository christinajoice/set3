import java.io.*;
import java.util.*;
public class Sort
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[]=new int[10];
System.out.println("Enter the number of elements");
int n=s.nextInt();
System.out.println("Enter the elements");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n-1;i++)
{
for(int j=1;j<n;j++)
{
if(a[j]<a[i])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("The sorted array is");
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}
