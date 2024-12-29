// program to demo onthe Swings 
import javax.swing.*;
import java.awt.*;

class Swings
{
	public static void main(String ar[])
	{
		JFrame f=new JFrame("My Frame");
		f.setSize(599,599);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=f.getContentPane();
		JButton b=new JButton("Click me");
		c.add(b);
		
	}
	
	
}