// program to demo onthe BankingEx
import javax.swing.*;
import java.awt.*;
class BankingEx extends JFrame
{
	BankingEx()
	{
		Container c=this.getContentPane();
		c.setLayout(new GridLayout(2,2));
		JLabel l=new JLabel("Enter the User id :");
		l.setFont(new Font("Helvetica",Font.BOLD,34));
		c.add(l);
		JLabel l1=new JLabel("Enter the Password");
		l1.setFont(new Font("Helvetica",Font.BOLD,34));
		c.add(l1);
		l1.setFont(new Font("Helvetica",Font.BOLD,34));
		
		
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