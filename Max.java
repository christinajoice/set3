import java.io.*;
import java.util.*;
class Max
{
public static void main(String args[])
{
int a[]=new int[10];
System.out.println("Enter the number of elements in an array");
Scanner s=new Scanner(System.in);
int N=s.nextInt();
System.out.println("Enter the elements of array");
  for(int i=0;i<N;i++)
  {
    a[i]=s.nextInt();
  }
  int max=a[0];
  for(int i=0;i<N;i++)
  {
   if( max<a[i])
     max=a[i];
  }
  System.out.println("The maximum element is"+max);
}
}
