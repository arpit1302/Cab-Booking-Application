import java.io.File;
import java.util.*;
class file2
{public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    String s;
    s=sc.next();
    File f=new File(s);
    if(f.exists()&&f.isFile())
    {f.delete();
    System.out.println("File Deleted");
    }
    else
    {
        System.out.println("File not Found");
    }
}
        }