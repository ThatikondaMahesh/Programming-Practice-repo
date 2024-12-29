// program to demo onthe JLAbel
import javax.swing.*;
import java.awt.*;
class BankingEx extends JFrame
{
	BankingEx()
	{
		Container c=this.getContentPane();
		c.setLayout(new GridLayout());
		JLabel l=new JLabel("Enter the User id");
		
		JLabel l1=new JLabel("Enter the PasswordAuthentication");
		
		l1.setFont(new Font("Helvetica",Font.BOLD,34));
		c.add(l);
		c.add(l1);
		
		
	}
	public static void main(String s[])
	{
		BankingEx f =new BankingEx();
		f.setSize(500,500);
		f.setVisible(true);
		f.setTitle("Banking");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
}