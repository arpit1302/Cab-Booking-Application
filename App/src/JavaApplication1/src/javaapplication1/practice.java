import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Action;
class oopfrm extends Frame implements ActionListener
{
    Frame f;
    Label l1,l2;
    TextField t1,t2;
    Button b1,b2,b3;
    oopfrm()
    {
        f=new Frame("cab Booking");
        f.setSize(500,500);
        f.setLayout(new GridLayout(3,2));
        f.setBackground(Color.DARK_GRAY);
        l1=new Label("userId");
        l2=new Label("password");
        t1=new TextField();
        t2=new TextField();
        b1=new Button("Sign In");
        b2=new Button("New User");
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        b1.addActionListener(this);
        f.add(b2);
        b2.addActionListener(this);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String x,y,z;
        x=t1.getText();
        y=t2.getText();
        if(e.getSource()==b1)
        {
            Scanner sc=new Scanner(System.in);
            x=sc.next();
            y=sc.next();
        }
        if(e.getSource()==b2)
        {
            newfrm n=new newfrm();
        }
    }
}
class newfrm extends Frame implements ActionListener
{
    Frame f;
    Label l1,l2,l3,l4,l5;
    TextField t1,t2,t3,t4,t5;
    Button b;
    newfrm()
    {
        f=new Frame("new user");
        f.setSize(500,500);
        f.setLayout(new GridLayout(6,2));
        f.setBackground(Color.DARK_GRAY);
        l1=new Label("Username");
        l2=new Label("UserId");
        l3=new Label("Password");
        l4=new Label("Phone number");
        l5=new Label("Email ID");
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        t4=new TextField();
        t5=new TextField();
        b=new Button("Register");
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        f.add(l5);
        f.add(t5);
        f.add(b);
        b.addActionListener(this);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ee)
    {
        if(ee.getSource()==b)
        {
            String x1,x2,x3,x4,x5;
            x1=t1.getText();
            x2=t2.getText();
            x3=t3.getText();
            x4=t4.getText();
            x5=t5.getText();
        }
    }
}
class practice
{
    public static void main(String args[])
    {
        oopfrm x=new oopfrm();
    }
}