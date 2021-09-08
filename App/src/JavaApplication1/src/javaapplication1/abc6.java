import java.awt.*;
import java.awt.event.*;
class frm7 extends Frame implements ActionListener 
{Frame f;
MenuBar mb;
TextField t;
Menu m1,m2,m3;
MenuItem ic1,ic2,s1,s2,q;
frm7()
{f=new Frame();
f.setSize(500,500);
f.setBackground(Color.red);
f.setLayout(new FlowLayout());
    mb=new MenuBar();
f.setMenuBar(mb);
m1=new Menu("Ice Cream");
m2=new Menu("Snacks");
m3=new Menu("Exit");
ic1=new MenuItem("Vanilla");
ic2=new MenuItem("Chocolate");
s1=new MenuItem("Noodles");
s2=new MenuItem("Burger");
q=new MenuItem("exit");
t=new TextField(30);
mb.add(m1);
m1.add(ic1);
ic1.addActionListener(this);
m1.add(ic2);
ic2.addActionListener(this);
mb.add(m2);
m2.add(s1);
s1.addActionListener(this);
m2.add(s2);
s2.addActionListener(this);
mb.add(m3);
m3.add(q);
q.addActionListener(this);
f.add(t);
f.setVisible(true);
}



public void actionPerformed(ActionEvent e)
{if(e.getSource()==ic1)
    t.setText("You selected Vanilla ice cream");
if(e.getSource()==ic2)
    t.setText("You selected Chocolate ice cream");
if(e.getSource()==s1)
    t.setText("You selected Noodles");
if(e.getSource()==s2)
    t.setText("You selected Burger");
if(e.getSource()==q)
    System.exit(0);
    }
}
class abc6
{public static void main(String args[])
{frm7 x=new frm7();

}
        }