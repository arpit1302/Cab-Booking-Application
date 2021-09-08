import java.awt.*;
import java.awt.event.*;
class frm4 extends Frame implements ItemListener
{Frame f;
Choice city;
String s[]={"karanal","chandigarh","panipat","delhi"};
TextField t;
Label l;
frm4()
{int i;
    f=new Frame("My Frame");
f.setSize(500,500);
f.setBackground(Color.red);
f.setLayout(new GridLayout(2,2));
t=new TextField();
l=new Label("City");
city=new Choice();
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
class abc5
{public static void main(String args[])
{frm4 x=new frm4();
}
        }