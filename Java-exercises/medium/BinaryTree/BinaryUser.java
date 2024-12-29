//progrma to binary node user 
import java.util.*;

public class BinaryUser
{
	public static BinaryNode<Integer> takeInput(boolean isroot,int parentData,boolean isleft)
	{
		Scanner sc=new Scanner(System.in);
		if(isroot)
		{
			System.out.print("Enter the root data");	
		}
		else
		{
			if(isleft)
			{
				System.out.print("Enter the left of the"+parentData);
			}
			else
			{
				System.out.print("Enter the right of the "+parentData);
			}
		}
		int rootData=sc.nextInt();
		if(rootData==-1)
		{
			return null;
		}
		BinaryNode<Integer> root=new BinaryNode<>(rootData);
		BinaryNode<Integer> leftChild=takeInput(false,rootData,true);
		BinaryNode<Integer> rightChild=takeInput(false,rootData,false);
		root.left=leftChild;
		root.right=rightChild;
		return root;
		
	}
	public static void printTree(BinaryNode<Integer> root)
	{
		if(root==null)
		{
			return ;
		}
		System.out.print(root.data);
		if(root.left!=null)
		{
			System.out.print("L of the "+root.left.data+"     ");
		}
		if(root.right!=null)
		{
			System.out.print("R of the "+root.right.data+"    ");
		}
		System.out.println();
		printTree(root.left);
		printTree(root.right);
	}
	public static void main(String ar[])
	{
		BinaryNode<Integer> root=takeInput(true,0,false);
		printTree(root);
		
	}
}