//program to Demo onthe swing components
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SwingComp extends JFrame
{
	SwingComp()
	{
		Container c=this.getContentPane();
		c.setLayout(new BorderLayout());
		JMenuBar mb=new JMenuBar();
		
		  JMenu fil =new JMenu("File");
		  mb.add(fil);
          JMenu m2=new JMenu("Edit");
			mb.add(m2);
			c.add("North",mb);
			JMenuItem n=new JMenuItem("New");
			JMenuItem s =new JMenuItem("Save");
			JMenuItem p=new JMenuItem("open");
			fil.add(n);
			fil.add(s);
			fil.add(p);
			JMenuItem  cu=new JMenuItem("cut");
			JCheckBoxMenuItem co =new JCheckBoxMenuItem("copy");
			JRadioButtonMenuItem pa=new JRadioButtonMenuItem("Paste");
			m2.add(cu);
			m2.add(co);
			m2.add(pa);
			
		    
		
		
		
	}
	
	
	
	public static void main(String ar[])
	{
		SwingComp f=new SwingComp();
		f.setSize(505,500);
		f.setVisible(true);
		f.setTitle("JMenu Demo");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}  