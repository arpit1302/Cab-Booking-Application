import java.awt.*;
import java.awt.event.*;
class frm2 extends Frame implements ItemListener
{Frame f;
Checkbox c1,c2,c3;
CheckboxGroup cb;
TextField t;
frm2()
{f=new Frame("my Frame");
f.setSize(500,500);
f.setBackground(Color.red);
f.setLayout(new GridLayout(4,1));
    cb=new CheckboxGroup();
c1=new Checkbox("red",cb,false);
c2=new Checkbox("yellow",cb,false);
c3=new Checkbox("green",cb,false);
t=new TextField();
f.add(c1);
c1.addItemListener(this);
f.add(c2);
c2.addItemListener(this);
f.add(c3);
c3.addItemListener(this);
f.add(t);
f.setVisible(true);
}
public void itemStateChanged(ItemEvent e)
{if(c1.getState()==true)
    t.setText("Stop");
if(c2.getState()==true)
    t.setText("go slow");
if(c3.getState()==true)
    t.setText("go");
    }
}
class abc3
{public static void main(String args[])
{frm2 x=new frm2();
        }
}