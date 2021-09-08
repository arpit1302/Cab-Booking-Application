import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
class file3
{public static void main(String args[]) throws FileNotFoundException, IOException 
{
    FileOutputStream fo=new FileOutputStream("C:\\Users\\surin\\Documents\\NetBeansProjects\\Javaapplication1\\src\\javaapplication1\\file4.java");
    String s;
    System.out.println("enter the line of text");
    Scanner sc=new Scanner(System.in);
    s=sc.next();
    for(int i=0;i<s.length();i++)
    {fo.write(s.charAt(i));
    
    }
    fo.close();
    FileInputStream fi=new FileInputStream("C:\\Users\\surin\\Documents\\NetBeansProjects\\Javaapplication1\\src\\javaapplication1\\file2.java");
    int read;
    System.out.println("Content in file4");
    while((read=fi.read())!=-1)
        System.out.print((char)read);
    fi.close();
}
        }