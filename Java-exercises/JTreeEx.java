import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
class JTreeEx extends JFrame
{
	JTreeEx()
	{
		DefaultMutableTreeNode root=new DefaultMutableTreeNode("Object");
		DefaultMutableTreeNode comp=new DefaultMutableTreeNode("components");
		root.add(comp);
		DefaultMutableTreeNode cont=new DefaultMutableTreeNode("Container");
		comp.add(cont);
		DefaultMutableTreeNode cc=new DefaultMutableTreeNode("jcomp");
		comp.add(cc);
		JTree t=new JTree(root);
		this.add(t);
		
	}
	
	
	public static void main(String ag[])
	{
		JTreeEx f=new JTreeEx();
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("JTable");
		f.setLayout(new FlowLayout());
	}
}