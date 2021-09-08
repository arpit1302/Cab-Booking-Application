import java.awt.*;
import java.awt.event.*;
class fram extends Frame implements ActionListener
{Frame f;
Label l1,l2;
TextField t1;
TextArea t2;
Button b;
fram()
{f=new Frame("My Frame");
f.setSize(500,500);
f.setLayout(new GridLayout(3,2));
f.setBackground(Color.red);
l1=new Label("Text Field");
l2=new Label("TExt Area");
b=new Button("add");
t1=new TextField(8);
t2=new TextArea(5,25);
f.add(l1);
f.add(t1);
f.add(l2);
f.add(t2);
f.add(b);
b.addActionListener(this);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{String x;
    x=t1.getText();
    t2.append(x+"\n");
    t1.setText("");
    t1.requestFocus();
}
}
class abc1
{public static void main(String args[])
{fram x=new fram();
        }
}