import java.awt.*;
import java.awt.event.*;
class frm3 extends Frame implements ItemListener
{Frame f;
Checkbox c1,c2,c3,c4,c5,c6;
CheckboxGroup cb1,cb2;
Label l1,l2;
frm3()
{f=new Frame("My Frame");
f.setSize(500,500);
f.setBackground(Color.red);
f.setLayout(new GridLayout(4,2));
cb1=new CheckboxGroup();
cb2=new CheckboxGroup();
c1=new Checkbox("HP",cb1,false);
c2=new Checkbox("Chandigarh",cb2,false);
c3=new Checkbox("UP",cb1,false);
c4=new Checkbox("Shimla",cb2,false);
c5=new Checkbox("Haryana",cb1,false);
c6=new Checkbox("Luckhnow",cb2,false);
l1=new Label("State");
l2=new Label("Capitals");
f.add(l1);
f.add(l2);
f.add(c1);
c1.addItemListener(this);
f.add(c2);
c2.addItemListener(this);
f.add(c3);
c3.addItemListener(this);
f.add(c4);
c4.addItemListener(this);
f.add(c5);
c5.addItemListener(this);
f.add(c6);
c6.addItemListener(this);
f.setVisible(true);
}
public void itemStateChanged(ItemEvent e)
{if(c1.getState()==true)
    c4.setState(true);
if(c3.getState()==true)
    c6.setState(true);
if(c5.getState()==true)
    c2.setState(true);
    }
}
class abc4
{public static void main(String args[])
{frm3 x=new frm3();

}
        }