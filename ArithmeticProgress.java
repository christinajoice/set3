import java.io.*;
import java.util.*;
class ArithmeticProgress
{
public static void main(String args[])
{
int a=1,n=3,d=1;
int add=0;
for(int i=1;i<=n;i++)
{
add=add+a;
a=a+d;
}
System.out.println("The arithmatic progression is"+a);
}
}
