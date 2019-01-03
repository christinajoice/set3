import java.io.*;
import java.util.*;
public class Timedifference
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int hour1,minute1;
int hour2,minute2;
int hour,minute;
System.out.println("Enter hour and minutes of time 1");
hour1=s.nextInt();
minute1=s.nextInt();
System.out.println("Enter hour and minutes of time 2");
hour2=s.nextInt();
minute2=s.nextInt();
hour=hour1-hour2;
minute=minute1-minute2;
if(minute<0)
{
minute=minute+60;
hour=hour+1;
}
System.out.println("Time difference is"+hour+"hours"+minute+"minutes");
}
}
