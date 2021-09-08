import java.awt.*;
import java.awt.event.*;
class frm6 extends Frame implements ItemListener
{Frame f;
List city;
String s[]={"karanal","chandigarh","panipat","delhi","Ambala"};
TextArea t;
Label l;
frm6()
{int i;
    f=new Frame("My Frame");
f.setSize(500,500);
f.setBackground(Color.red);
f.setLayout(new GridLayout(2,2));
t=new TextArea(5,5);
l=new Label("City");
city=new List(4,true);
f.add(l);
f.add(t);
f.add(city);
city.addItemListener(this);
for(i=0;i<=4;i++)
{city.add(s[i]);
}
f.setVisible(true);
}
public void itemStateChanged(ItemEvent e)
{String s[]=new String[10];
t.setText("");
s=city.getSelectedItems();
int a=s.length;
for(int i=0;i<=a;i++)
{
    t.append(s[i]+"\n");
}
}
}
        
class list1
{public static void main(String args[])
{frm6 x=new frm6();
}
        }