// program toJcomponets
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

class Jcomponents extends JFrame implements ActionListener
{
	JLabel l2;
	Jcomponents()
	{
		this.setLayout(new FlowLayout());
		Container c=this.getContentPane();
		
		JButton b=new JButton("Click me");
		JLabel lb=new JLabel("MAHA DEVA");
		c.add(b);
		c.add(lb);
		ImageIcon img =new ImageIcon("Mahadev.jpeg");
		JLabel lb1=new JLabel("maha",img,JLabel.LEFT);
		c.add(lb1);
		// setTExt();
		//setIcon
		
		l2=new JLabel();
		// buttons
		JButton b1=new JButton("clickme",img);
		b1.addActionListener(this);
		c.add(b1);
		c.add(l2);
		// JComboBoxes
		JComboBox jc =new JComboBox();
		String country[]={"LOndon","America","india"};
		jc.addItem("Delhi");
		JComboBox jc1 =new JComboBox(country);
		jc1.addActionListener(this);
		c.add(jc1);
		
		// Jlists
		JList jl=new JList();
		String inte[] ={"read","write","walk"};
		jl.setListData(inte);
		c.add(jl);
		
		
		
		
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		l2.setText("BUtton clicked"+new Date());
		System.out.println("BUtton clicked"+new Date());
	}
	
	
	
	public static void main(String as[])
	{
		Jcomponents f=new Jcomponents();
		f.setSize(599,599);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}