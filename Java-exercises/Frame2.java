//programto implement the Frame 2
import java.awt.*;
import java.awt.event.*;
class Frame2 extends Frame implements ActionListener
{
	Frame2()
	{
		setLayout(new FlowLayout());
		Button b=new Button("Back");
		add(b);
	    b.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			
		});
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		this.dispose();
	}
}