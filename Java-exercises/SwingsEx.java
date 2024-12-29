// program to Demo onthe Swings
import javax.swing.*;
import java.awt.*;
class Mypanel extends JPanel
{
	Mypanel()
	{
		this.setBackground(Color.green);
		
	}
	public void paintComponent(Graphics g)
	{
		//super.paintComponent(g);
		g.setColor(Color.red);
		g.setFont(new Font("Helvetica",Font.BOLD,35));
		g.drawString("HEllo Learners",50,100);
		
	}
	
	
}

class SwingsEx extends JFrame
{
	
	SwingsEx(String s)
	{
		super(s);
	}
	public static void main(String ad[])
	{
		SwingsEx f = new SwingsEx("MAHA DEVA");
		f.setSize(500,600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Mypanel p=new Mypanel();
		
		Container c = f.getContentPane();
		
		c.setBackground(Color.black);
		c.add(p);
		
		
	}
	
	
	
}