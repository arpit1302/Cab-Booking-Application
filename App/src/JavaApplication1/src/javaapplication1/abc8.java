import java.awt.*;
import java.awt.event.*;
class frm8 extends Frame implements ActionListener
{Frame f;
MenuBar mb;
Menu m1,m2;
MenuItem i1,i2,i3;
Choice city1;
List city2;
Label l;
TextField t;
String s[]={"Delhi","Chandigarh","Panipat","Karnal"};
frm8()
{int i;
f=new Frame("My Frame");
f.setSize(500,500);
f.setBackground(Color.red);
f.setLayout(new FlowLayout());
l=new Label("city");
t=new TextField(15);
mb=new MenuBar();
f.setMenuBar(mb);
m1=new Menu("To add cities");
m2=new Menu("Exit");
i1=new MenuItem("List");
i2=new MenuItem("Choiice");
i3=new MenuItem("Exit");
city1=new Choice();
city2=new List(3,false);
mb.add(m1);
m1.add(i1);
i1.addActionListener(this);
m1.add(i2);
i2.addActionListener(this);
mb.add(m2);
m2.add(i3);
i3.addActionListener(this);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{int i;

if(e.getSource()==i1)
{
    frm5 x=new frm5();
}

if(e.getSource()==i2) 
{
    frm4 z=new frm4();
}

if(e.getSource()==i3)
    System.exit(0);
}

}
class abc8
{public static void main(String args[])
{frm8 y=new frm8();

}
        }
