//  program to Demo onthe two frames
import java.awt.*;
import java.awt.event.*;
class TwoFrames extends Frame implements ActionListener
{
	Button b1,b2;
	TwoFrames()
	{
		this.setLayout(null);
		b1=new Button("Next");
		b2=new Button("Close");
		b1.setBounds(200,100,70,400);
		b2.setBounds(300,100,70,400);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			Frame f1=new Frame("Frame 2");
			f1.setSize(500,500);
			f1.setVisible(true);
			
		}
		else
		{
			System.exit(0);
			
		}
		
		
	}
	
	public static void main(String age[])
	{
		TwoFrames f =new TwoFrames();
		f.setSize(500,500);
		f.setVisible(true);
		f.setTitle("Frame 1");
		
		
		
	}
	
	
}