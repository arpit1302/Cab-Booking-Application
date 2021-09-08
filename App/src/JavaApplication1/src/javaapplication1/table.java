import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class tab extends JFrame
{JFrame f;
String heading[]={"Film Name","Rating Number"};
String content[][]={
    {"Rash Hour","1"},
    {"Golden Eye","2"},
    {"You have got mail","3"},
    {"Nice Guy","4"},
    {"Titanic","5"},
    {"Who am I","6"},
    {"The Water World","7"},
    {"The Mask","8"},
};
tab()
{f=new JFrame("My Frame");
f.setLayout(new GridLayout(4,2));
f.setBackground(Color.red);
f.setSize(500,500);
JTable t=new JTable(content,heading);
t.setGridColor(Color.red);
t.setForeground(Color.yellow);
t.setBackground(Color.black);
JScrollPane j=new JScrollPane(t,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
f.add(j);
f.setVisible(true);
}
}
class table
{public static void main(String args[])
{tab x=new tab();

}
        }