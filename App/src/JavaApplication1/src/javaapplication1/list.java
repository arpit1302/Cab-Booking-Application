import java.awt.*;
import java.awt.event.*;
class frm5 extends Frame implements ItemListener
{Frame f;
List city;
String s[]={"karanal","chandigarh","panipat","delhi","Ambala"};
TextField t;
Label l;
frm5()
{int i;
    f=new Frame("My Frame");
f.setSize(500,500);
f.setBackground(Color.red);
f.setLayout(new GridLayout(2,2));
t=new TextField();
l=new Label("City");
city=new List(3,false);
f.add(l);
f.add(t);
f.add(city);
city.addItemListener(this);
for(i=0;i<=3;i++)
{city.add(s[i]);
}
f.setVisible(true);
}
public void itemStateChanged(ItemEvent e)
{t.setText(city.getSelectedItem());
}
}
class list
{public static void main(String args[])
{frm5 x=new frm5();
}
        }