import java.util.*;
class Holiday
{
public static void main(String args[])
{
String s;
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
switch(s)
{
case "sunday":
System.out.println("False");
break;
case "monday":
System.out.println("True");
break;
case "tuesday":
System.out.println("True");
break;
case "wednesday":
System.out.println("True");
break;
case "thursday":
System.out.println("True");
break;
case "friday":
System.out.println("True");
break;
case "saturday":
System.out.println("True");
break;
default:
System.out.println("Invalid Data");
break;
}
}
}
