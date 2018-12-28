import java.io.*;
import java.util.*;
public class Median
{
public static void main(String args[])
{
int i,j;
Scanner s=new Scanner(System.in);
int a[]=new int[10];
System.out.println("Enter the number of elements");
int n=s.nextInt();
System.out.println("Enter the elements");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n-1;i++)
{
for(j=1;j<n;j++)
{
if(a[i]>a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
if(n%2!=0)
{
System.out.println("The median is"+a[n/2]);
}
else
{
System.out.println("The median is"+(a[(n-1)/2]+a[n/2])/2);
}
}
}
