import java.awt.*;
import java.awt.event.*;
class frm1 extends Frame implements ActionListener
{Frame f;
Checkbox c1,c2,c3;
TextField t,t1,t2,t3,t4,t5,t6;
Label l;
Button b;
frm1()
{f=new Frame("My Frame");
f.setSize(500,500);
f.setBackground(Color.red);
f.setLayout(new GridLayout(4,3));
c1=new Checkbox("Pen 10 rupees");
c2=new Checkbox("Pencil 8 rupees");
c3=new Checkbox("eraser 5 rupees");
t1=new TextField("");
t2=new TextField("");
t3=new TextField("");
t4=new TextField("");
t5=new TextField("");
t6=new TextField("");
t=new TextField("");
b=new Button("ok");
f.add(c1);
f.add(t1);
f.add(t2);
f.add(c2);
f.add(t3);
f.add(t4);
f.add(c3);
f.add(t5);
f.add(t6);
f.add(t);
f.add(b);
b.addActionListener(this);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{int sum=0;
int x,y,z,a,b,c;



if(c1.getState()==true)
{x=Integer.parseInt(t1.getText());
    t2.setText(String.valueOf(x*10));
sum=sum+x*10;
}
if(c1.getState()==false)
{t1.setText("");
t2.setText("");
}
if(c2.getState()==true)
{y=Integer.parseInt(t3.getText());
    t4.setText(String.valueOf(y*8));
sum=sum+y*8;
}
if(c2.getState()==false)
{t3.setText("");
t4.setText("");
}
if(c3.getState()==true)
{   z=Integer.parseInt(t5.getText());
    t6.setText(String.valueOf(z*5));
sum=sum+z*5;
}
if(c3.getState()==false)
{t5.setText("");
t6.setText("");
}
t.setText(String.valueOf(sum));
}
}
class abc2
{public static void main(String args[])
{frm1 x=new frm1();

}
        }