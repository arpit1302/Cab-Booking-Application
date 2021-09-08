package javaapplication1.virk;
import java.util.*;
public class room
{public int l;
public int b;
int a;
public void getdata()
{Scanner sc=new Scanner(System.in);
System.out.println("enter length and breadth");
l=sc.nextInt();
b=sc.nextInt();
}
public void process()
{a=l*b;
}
public void display()
{System.out.println("area="+a);
}
}