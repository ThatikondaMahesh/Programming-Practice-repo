// Project on  the Simple Banking APPlication
import javax.swing.*;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;

class Project extends JFrame implements ActionListener
{
	JTextField f1;
	JLabel ll;
	JLabel logo;
	
	Project()
	{
		Container c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.yellow);
		ImageIcon img =new ImageIcon("SBI.jpg");
		logo=new JLabel(img);
		logo.setBounds(780,130,500,500);
		c.add(logo);
		JLabel n=new JLabel("UserName:➡️");
		n.setBounds(100,100,130,25);
		
		c.add(n);
		 f1=new JTextField();
		 f1.setBounds(250,100,130,35);
		c.add(f1);
		 JLabel a=new JLabel("password:➡️");
		 a.setBounds(100,170,130,25);
		c.add(a);
		 JPasswordField ad=new JPasswordField(15);
		 ad.setEchoChar('*');
		 ad.setBounds(250,170,130,30);
		c.add(ad);
		JLabel g=new JLabel("Terms&Condition");
		 g.setBounds(100,300,130,25);
		 c.add(g);
		 JRadioButton m=new JRadioButton("Agree");
		 m.setBounds(250,300,75,25);
		 c.add(m);
		 JRadioButton f=new JRadioButton("Disagree");
		 f.setBounds(335,300,75,25);
		 c.add(f);
		 ButtonGroup bg=new ButtonGroup();
		 bg.add(f);
		 bg.add(m);
		 JButton b=new JButton("Submit");
		 b.setBounds(165,400,150,35);
		 b.addActionListener(this);
		 c.add(b); 
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String s=f1.getText();
		if(s.equals("Raju"))
		{	
			new Raju();
			
		}
		else if(s.equals("Saikumar"))
		{
			new Saikumar();
			
			
		}
		else if(s.equals("Yashwanth"))
		{
		     //new Yashwanth();
			
		}
		else
		{
			//System.out.println("Invalid UserData😒");
			
		}
		
		
	}
	
	
	public static void main(String ar[])
	{
		Project f=new Project();
		f.setSize(500,500);
		f.setVisible(true);
		f.setTitle("Simple SBI Banking");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class Raju extends JFrame implements ActionListener
{
	int balance=0;
	JButton b1,b2,b3,b4;
	JLabel temp;
	Container c1;
	
	Raju()
	{
		this.setSize(500,500);
		setVisible(true);
		setTitle("YOUR ACCOUNT");
		int buttonWidth = 150;
        int buttonHeight = 30;
        int buttonSeparation = 10;
        int initialY = 50;
		 
		c1.setLayout(null);
		b1=new JButton("Deposit");
		b1.setBounds(50, initialY, buttonWidth, buttonHeight);
		b1.addActionListener(this);
		c1.add(b1);
		
		b2=new JButton("WithDraw");
		b2.setBounds(50, initialY + buttonHeight + buttonSeparation, buttonWidth, buttonHeight);
		b2.addActionListener(this);
		c1.add(b2);
		
		b3=new JButton("CheckBalance");
		b3.setBounds(50, initialY + 2 * (buttonHeight + buttonSeparation), buttonWidth, buttonHeight);
		b3.addActionListener(this);
		c1.add(b3);
		b4=new JButton("Exit");
		b4.setBounds(50, initialY + 3 * (buttonHeight + buttonSeparation), buttonWidth, buttonHeight);
		b4.addActionListener(this);
		c1.add(b1);
		temp=new JLabel();
	}
	public void actionPerformed(ActionEvent e)
	{
			if(e.getSource()==b1)
			{
				JTextField am=new JTextField();
				c1.setBounds(300,300,40,130);
				String amount=am.getText();
				int amou=Integer.parseInt(amount);
				balance=balance+amou;
				temp.setText("Hello Customer Deposit Successful current balance:"+balance);
				temp.setBounds(50, 50, 200, 30);
				
			}
			else if(e.getSource()==b2)
			{
				JTextField am=new JTextField();
				c1.setBounds(300,300,40,130);
				String amount=am.getText();
				int amou=Integer.parseInt(amount);
				balance=balance-amou;
				temp.setText("Hello Customer  WithDraw Successful,current balance:"+balance);
				temp.setBounds(50, 50, 200, 30);
			
			}
			else if(e.getSource()==b3)
			{
			    temp.setText("Hello Customer  WithDraw Successful,current balance:"+balance);
				temp.setBounds(50, 50, 200, 30);	
			
			}
			else if(e.getSource()==b4)
			{
				System.exit(0);
		
			}
			
	}
		
}
class Saikumar extends JFrame implements ActionListener
{
	int balance=0;
	JButton b1,b2,b3,b4;
	JLabel temp;
	Container c1;
	
	Saikumar()
	{
		this.setSize(500,500);
		setVisible(true);
		setTitle("YOUR ACCOUNT");
		int buttonWidth = 150;
        int buttonHeight = 30;
        int buttonSeparation = 10;
        int initialY = 50;
		 
		c1.setLayout(null);
		b1=new JButton("Deposit");
		b1.setBounds(50, initialY, buttonWidth, buttonHeight);
		b1.addActionListener(this);
		c1.add(b1);
		
		b2=new JButton("WithDraw");
		b2.setBounds(50, initialY + buttonHeight + buttonSeparation, buttonWidth, buttonHeight);
		b2.addActionListener(this);
		c1.add(b2);
		
		b3=new JButton("CheckBalance");
		b3.setBounds(50, initialY + 2 * (buttonHeight + buttonSeparation), buttonWidth, buttonHeight);
		b3.addActionListener(this);
		c1.add(b3);
		b4=new JButton("Exit");
		b4.setBounds(50, initialY + 3 * (buttonHeight + buttonSeparation), buttonWidth, buttonHeight);
		b4.addActionListener(this);
		c1.add(b1);
		temp=new JLabel();
	}
	public void actionPerformed(ActionEvent e)
	{
			if(e.getSource()==b1)
			{
				JTextField am=new JTextField();
				c1.setBounds(300,300,40,130);
				String amount=am.getText();
				int amou=Integer.parseInt(amount);
				balance=balance+amou;
				temp.setText("Hello Customer Deposit Successful current balance:"+balance);
				temp.setBounds(50, 50, 200, 30);
				
			}
			else if(e.getSource()==b2)
			{
				JTextField am=new JTextField();
				c1.setBounds(300,300,40,130);
				String amount=am.getText();
				int amou=Integer.parseInt(amount);
				balance=balance-amou;
				temp.setText("Hello Customer  WithDraw Successful,current balance:"+balance);
				temp.setBounds(50, 50, 200, 30);
			
			}
			else if(e.getSource()==b3)
			{
			    temp.setText("Hello Customer  WithDraw Successful,current balance:"+balance);
				temp.setBounds(50, 50, 200, 30);	
			
			}
			else if(e.getSource()==b4)
			{
				System.exit(0);
		
			}
			
	}
		
}