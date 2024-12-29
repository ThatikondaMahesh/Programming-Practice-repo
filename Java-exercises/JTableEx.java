// program to demo on the jtable
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
class JTableEx extends JFrame
{
	JTableEx()
	{
	String row[][]={{"1","mahesh","98"},{"2","naresh","89"}};
		String col[]={"r.NO","Name","Marks"};
		JTable t =new JTable(row,col);
		JScrollPane jsp=new JScrollPane(t);
		this.add(jsp);
		Vector<Vector> rows=new Vector<Vector>();
		Vector rowone=new Vector();
		rowone.add("1");
		rowone.add("mahesh");
		rowone.add("98");
		Vector rowone1=new Vector();
		rowone1.add("2");
		rowone1.add("naresh");
		rowone1.add("99");
		Vector cols=new Vector();
	    cols.add("R.no");
		cols.add("Name");
		cols.add("Marks");
		rows.add(rowone);
		rows.add(rowone1);
		JTable t1 =new JTable(rows,cols);
		JScrollPane jsp1=new JScrollPane(t1);
		this.add(jsp1);
		
	}

	public static void main(String af[])
	{
		JTableEx f=new JTableEx();
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("JTable");
		f.setLayout(new FlowLayout());
		
		
	}
	
}