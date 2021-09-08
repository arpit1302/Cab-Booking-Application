import java.awt.*;
import java.awt.event.*;
class frm extends Frame implements ActionListener
{Frame f;
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2,b3,b4;
frm()
{f=new Frame("My Frame");
f.setSize(500,500);
f.setLayout(new GridLayout(7,2));
f.setBackground(Color.red);
l1=new Label("Enter A");
l2=new Label("Enter B");
l3=new Label("Result");
t1=new TextField(8);
t2=new TextField(8);
t3=new TextField(8);
b1=new Button("add");
b2=new Button("Subtract");
b3=new Button("Product");
b4=new Button("Division");
f.add(l1);
f.add(t1);
f.add(l2);
f.add(t2);
f.add(l3);
f.add(t3);
f.add(b1);
b1.addActionListener(this);
f.add(b2);
b2.addActionListener(this);
f.add(b3);
b3.addActionListener(this);
f.add(b4);
b4.addActionListener(this);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{int x,y,z;
x=Integer.parseInt(t1.getText());
y=Integer.parseInt(t2.getText());
if(e.getSource()==b1)
{z=x+y;
t3.setText(String.valueOf(z));
}
if(e.getSource()==b2)
{z=x-y;
t3.setText(String.valueOf(z));
}
if(e.getSource()==b3)
{z=x*y;
t3.setText(String.valueOf(z));
}
if(e.getSource()==b4)
{z=x/y;
t3.setText(String.valueOf(z));
}
}
}
class abc
{public static void main(String args[])
{frm x=new frm();
}
}
      