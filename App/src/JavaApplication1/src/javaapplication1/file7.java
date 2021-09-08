import java.io.*;
import java.util.*;
class file7
{public static void main(String args[]) throws FileNotFoundException, IOException
{RandomAccessFile r1=new RandomAccessFile("surinder.dat","rw");
Scanner sc=new Scanner(System.in);
for(int i=0;i<=2;i++)
{
    System.out.println("Enter roll and marks");
    int roll=sc.nextInt();
    int marks=sc.nextInt();
    r1.writeInt(roll);
    r1.writeInt(marks);
}
r1.seek(0);
for(int i=0;i<=2;i++)
{
    System.out.println(r1.readInt());
    System.out.println(r1.readInt());
}
r1.close();
}
        }