import java.io.*;
import java.util.*;
public class Intcheck
{
public static void main(String args[])
{
int i;
Scanner s=new Scanner(System.in);
String str;
System.out.println("Enter a value");
str=s.next();
try
{
int n=Integer.parseInt(str);
System.out.println("It is an integer");
}
catch(NumberFormatException e)
{
System.out.println("Not an integer");
}
}
}
