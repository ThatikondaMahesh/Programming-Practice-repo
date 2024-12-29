//program to demo onthe Graphics 
import java.awt.*;
import java.awt.event.*;
class GraphicsEx extends Frame
{
	public static void main(String Er[])
	{
		
		GraphicsEx g=new GraphicsEx("HEllo");
		g.setSize(400,400);
		g.setVisible(true);
		g.addWindowListener(new MyListener());
	}
	public void paint(Graphics d)
	{
		d.drawLine(400,500,600,700);
		d.setColor(Color.red);
		d.drawRect(100,200,500,500);
		
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