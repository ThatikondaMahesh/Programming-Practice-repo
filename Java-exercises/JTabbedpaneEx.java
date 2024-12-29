// program to JTabbed Pane
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
class JTabbedpaneEx extends JFrame
{
	JTabbedpaneEx()
	{
		
		this.setLayout(new FlowLayout());
		JTabbedPane jp=new JTabbedPane(JTabbedPane.TOP);
		//add(title,0bject)
		//addTab(title,image,Object)
		//insertTab(title,image,object,tip,index)
		ImageIcon img =new ImageIcon("Mahadev.jpeg");
		jp.addTab("Home",img,new Home());
		jp.addTab("View",img,new View());
		this.add(jp);
		
	}
	
	
	public static void main(String ar[])
	{
		JTabbedpaneEx f =new JTabbedpaneEx();
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("JTabbedpane");
		
	}
}
class Home extends JPanel
{
	Home()
	{
		JButton b1=new JButton("CLip board");
		JButton b2=new JButton("image");
		JButton b3=new JButton("tools");
		JButton b4=new JButton("colora");
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		
	}
	
	
	
}
class View extends JPanel 
{
	View()
	{
		JButton b1=new JButton("zooom");
		JButton b2=new JButton("HIde");
		JButton b3=new JButton("Display");
		this.add(b1);
		this.add(b2);
		this.add(b3);		

		
	}
	
}