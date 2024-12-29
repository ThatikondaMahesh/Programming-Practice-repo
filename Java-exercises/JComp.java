// programt to demoonthe Jcheckbox,jRadiobuton,Jtextfeild
import javax.swing.*;
import java.awt.*;
class JComp extends JFrame
{
	JComp()
	{
		Container c=this.getContentPane();
		c.setLayout(null);
		JLabel n=new JLabel("Name:");
		n.setBounds(100,100,130,25);
		c.add(n);
		 JTextField f1=new JTextField();
		 f1.setBounds(250,100,130,35);
		c.add(f1);
		 JLabel a=new JLabel("Address:");
		 a.setBounds(100,170,130,25);
		 
		c.add(a);
		 JTextArea add=new JTextArea();
		 add.setBounds(250,170,130,100);
		c.add(add);
		JLabel g=new JLabel("Gender ");
		 g.setBounds(100,300,130,25);
		 c.add(g);
		 JRadioButton m=new JRadioButton("M");
		 m.setBounds(250,300,75,25);
		 c.add(m);
		 JRadioButton f=new JRadioButton("F");
		 f.setBounds(335,300,75,25);
		 c.add(f);
		 ButtonGroup bg=new ButtonGroup();
		 bg.add(f);
		 bg.add(m);
		 JLabel ln =new JLabel("Langauges");
		 ln.setBounds(100,350,130,25);
		 JCheckBox c1=new JCheckBox("Telugu");
		 c1.setBounds(250,350,75,25);
		 c.add(c1);
		 JCheckBox c2=new JCheckBox("English");
		 c2.setBounds(335,350,75,25);
		 c.add(c2);
		 JButton b=new JButton("Submit");
		 b.setBounds(165,400,150,35);
		 c.add(b);
		
	}
	
	
	public static void main(String ar[])
	{
		JComp f=new JComp();
		f.setSize(500,500);
		f.setVisible(true);
		f.setTitle("Maha deva");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}