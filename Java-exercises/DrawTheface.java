import java.awt.*;
import java.awt.event.*;
class DrawTheface extends Frame
{
	String s;
	DrawTheface(String a)
	{
		super(a);
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent w)
			{	
				System.exit(0);	
			}	
		});
		

	}
	public void paint(Graphics g)
	{
		this.setBackground(Color.green);
		g.setColor(Color.blue);
		g.fillRect(40,40,200,200);
		g.setColor(Color.yellow);
		g.fillOval(90,70,80,80);
		g.setColor(Color.black);
		g.fillOval(110,95,5,5);
		g.fillOval(145,95,5,5);
		g.drawLine(130,95,130,115);
		g.setColor(Color.red);
		g.fillArc(113,115,35,20,0,-180);
		g.drawString("Hello hi welcome ",90,1700);	
	}
	
	
	public static void main(String art[])
	{
		DrawTheface f=new DrawTheface("Welcome💝");
		f.setSize(500,600);
		f.setVisible(true);
	}
	
	
}
