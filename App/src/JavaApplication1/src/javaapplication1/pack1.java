import javaapplication1.virk.*;
import java.util.*;
class drawingroom extends room
{int h;
int v;
void get()
{getdata();
Scanner sc=new Scanner(System.in);
System.out.println("enter height of room");
h=sc.nextInt();
}
void process1()
{
    v=l*b*h;
}
void show()
{System.out.println(v);
}
}
class pack1
{public static void main(String args[])
{drawingroom x=new drawingroom();
x.get();
x.process1();
x.show();
dimension y=new dimension();
y.display1();
}
}