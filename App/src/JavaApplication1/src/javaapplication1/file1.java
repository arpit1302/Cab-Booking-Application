import java.io.File;
class file1
{public static void main(String args[])
{File f=new File("C:\\Users\\surin\\Documents\\NetBeansProjects\\Javaapplication1\\src\\javaapplication1\\abc1.java");
System.out.println("File name"+f.getName());
System.out.println("File path"+f.getPath());
System.out.println(f.exists()?"File exist":"File not found");
System.out.println("File Size"+f.length());
System.out.println("File last Modified time"+f.lastModified());
}
        }