import java.awt.*;
import java.awt.event.*;
class FrameEx
{
	public static void main(String agr[])
	{
		Frame f=new Frame("Welcome");
		f.setSize(400,400);
		f.setVisible(true);
		f.addWindowListener(new MyListener());
		
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.pink);
		g.drawLine(100,200,300,400);
		g.drawRect(200,300,400,450);
		
		
	}

}
class MyListener implements WindowListener
{
	public void windowClosing(WindowEvent e)
	{
		System.out.println("closing themetid");
		System.exit(0);
		
	}
	public void windowClosed(WindowEvent e)
	{
		System.out.println("closed");	
	}
	public void windowActivated(WindowEvent e)
	{
		
		System.out.println("Activated");
	}
	public void windowDeactivated(WindowEvent e)
	{
		System.out.println("DeActivated");
		
		
	}
	public void windowIconified(WindowEvent e)
	{
		
		System.out.println("Iconised");
	}
	public void windowDeiconified(WindowEvent e)
	{
		System.out.println("Deiconised");
	}
	public void windowOpened(WindowEvent e)
	{
		System.out.println("Opened");
		
	}
	
	
}