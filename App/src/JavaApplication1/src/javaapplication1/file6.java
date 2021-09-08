import java.io.*;
import java.util.*;
class file6
{public static void main(String args[]) throws FileNotFoundException, IOException
{FileInputStream fi=new FileInputStream("C:\\Users\\surin\\Documents\\NetBeansProjects\\Javaapplication1\\src\\javaapplication1\\file3.java");
FileOutputStream fo=new FileOutputStream("C:\\Users\\surin\\Documents\\NetBeansProjects\\Javaapplication1\\src\\javaapplication1\\file4.java");
String s;
int read;
while((read=fi.read())!=-1)
    fo.write((char)read);
fi.close();
fo.close();
}
        }