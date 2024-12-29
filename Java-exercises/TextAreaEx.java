//program todemoo onthe Textbox
import java.awt.*;
import java.awt.event.*;
class TextAreaEx extends Frame implements ActionListener 
{
	TextField t1,t2;
	TextAreaEx()
	{
		this.setLayout(new FlowLayout());
		Label l1=new Label("Name :",Label.LEFT);
		Label l2=new Label("Password:",Label.LEFT);
		t1=new TextField(20);
		t2=new TextField(20);
		t2.setEchoChar('*');
		t1.setBackground(Color.yellow);
		t1.setForeground(Color.red);
		Font f =new Font("Arial",Font.PLAIN,25);
		t1.setFont(f);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		t1.addActionListener(this);// listener to text
		t2.addActionListener(this);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.out.println("hi closing");
				System.exit(0);
			}
			
			
		});
		
			
		
		
	}
	
	
	public void  actionPerformed(ActionEvent e)
	{
		Graphics g=this.getGraphics();
		g.drawString("Name "+t1.getText(),10,200);
		g.drawString("pass Word "+t2.getText(),10,240);
		
	}
	public static void main(String ar[])
	{
		TextAreaEx f=new TextAreaEx();
		f.setSize(500,500);
		f.setTitle("textArea Demo");
		f.setVisible(true);
		
		
	}
	
	
}