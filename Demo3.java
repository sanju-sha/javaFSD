import java.awt.*;
import javax.swing.*;
public class Demo3 
{
public static void main(String[]args)
{
	JFrame f=new JFrame("Notepad");
	f.setVisible(true);
	JTextArea t=new JTextArea();
	f.setSize(500,500);
	MenuBar mb= new MenuBar();
	f.setMenuBar(mb);
	f.add(t);
}
}
