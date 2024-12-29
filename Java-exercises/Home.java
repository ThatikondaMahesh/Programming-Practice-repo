// program to Draw the Home 
import java.awt.*;
import java.awt.event.*;
class Home extends Frame 
{
	Home()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			
		});
	}
		
		
		public void paint(Graphics g)
		{
			this.setBackground(Color.gray);
			int a[]={375,275,475};
			int b[]={125,200,200};
			g.setColor(Color.yellow);
			g.fillRect(300,200,150,100);
			g.setColor(Color.orange);
			g.fillRect(350,200,50,60);
			
			g.drawLine(350,280,400,280);
			g.fillPolygon(a,b,3);
			g.setColor(Color.cyan);
			g.fillOval(100,100,60,60);
			g.setColor(Color.green);
			g.fillArc(50,250,150,100,0,180);
			g.fillArc(150,250,150,100,0,180);
			g.fillArc(450,250,150,100,0,180);
			g.drawLine(50,300,600,300);
			
			g.drawString("My happy HOme",275,350);
			
		}
		
	
	public static void main(String ar[])
	{
		Home f= new Home();
		f.setSize(500,600);
		f.setVisible(true);
	
	}
	
	
	
}