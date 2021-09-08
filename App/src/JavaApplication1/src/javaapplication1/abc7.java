import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class jfrm extends JFrame implements ActionListener
{JFrame f;
JLabel l1,l2;
JTextField t1,t2;
JButton b;
JTextArea t;
jfrm()
{f=new JFrame("My Frame");
f.setSize(500,500);
f.setBackground(Color.red);
f.setLayout(null);
l1=new JLabel("Username");
l2=new JLabel("Password");
b=new JButton("ok");
t=new JTextArea(5,25);
t1=new JTextField(8);
t2=new JTextField(8); 
l1.setBounds(0,0,100,100);
l2.setBounds(0,100,100,100);
t1.setBounds(100,0,100,100);
t2.setBounds(100,100,100,100);
b.setBounds(0,300,100,100);
t.setBounds(100,300,200,100);
f.add(l1);
f.add(l2);
f.add(t1);
f.add(t2);
f.add(t);
f.add(b);
b.addActionListener(this);
b.setMnemonic('O');
b.setToolTipText("passes to textarea");
f.setVisible(true);
        }
public void actionPerformed(ActionEvent e)
{String x,y;
x=t1.getText();
y=t2.getText();
t.append("Username="+x+"\n");
t.append("Password="+y+"\n");
t1.setText("");
t2.setText("");
t1.requestFocus();
}
}
class abc7
{public static void main(String args[])
{jfrm x=new jfrm();

}
        }