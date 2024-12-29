// program to demo onthe JSplitpane
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
class  JSplitpaneEx extends JFrame 
{
	JSplitpaneEx()
	{
		Container c=this.getContentPane();
		
		JButton l=new JButton("click me");
		JCheckBox r=new JCheckBox("Button clicked");
		JSplitPane jp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,l,r);
		
		c.add(jp);
		
	}




	public static void main(String ar[])
	{
		JSplitpaneEx f=new JSplitpaneEx();
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("JTable");
		f.setLayout(null);
		
		
	}
}