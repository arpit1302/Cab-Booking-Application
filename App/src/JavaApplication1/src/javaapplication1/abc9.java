import java.util.*;
class rope
{
    int feet;
    int inch;
    void getdata()
    {
        System.out.println("Enter feet and inches of rope");
        Scanner sc=new Scanner(System.in);
        feet=sc.nextInt();
        inch=sc.nextInt();
    }
    void process(rope p)
    {
        feet=feet+p.feet;
        inch=inch+p.inch;
        
    }
    void dispay()
    {
        System.out.println(feet+" "+inch);
    }
}
class abc9
{public static void main(String args[])
{
    rope x[]=new rope[3];
    x[0]=new rope();
    x[0].getdata();
    for(int i=1;i<=2;i++)
    {
        x[i]=new rope();
        x[i].getdata();
        x[0].process(x[i]);
    }
    x[0].dispay();
}
        }