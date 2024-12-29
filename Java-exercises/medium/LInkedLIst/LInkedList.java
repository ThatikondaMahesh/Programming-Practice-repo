// program to demo onthe linked List
import java.util.*;
public class LinkedList
{
	public static  Node<Integer> takeInput()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the frist value");
        int data=scan.nextInt();
		Node<Integer> head=null;
		
	  while(data!=-1)
	  {
		  Node<Integer> newnode=new Node<>(data);
		  if(head==null)
		  {
			 head=newnode;
		  }
		  else
		  {
			  Node<Integer> tail=head;
			  while(tail.next!=null)
			  {
				  tail=tail.next;  
			  }  
			  tail.next=newnode;
		  }
		  System.out.println("enter the remaining values");
		  data=scan.nextInt();
		  
	  }	
      
	return head;	
	}
	
	public static Node<Integer> Insertion(Node<Integer> head,int ele,int pos)
	{
		if(head==null && pos>0)
		{
			return head;
		}
		if(pos==0)
		{
			Node<Integer> newnode =new Node<>(ele);
			newnode.next=head;
			return newnode;
		}
	else
	{
		Node<Integer> smallerHead=Insertion(head.next,ele,pos-1);	
		head.next=smallerHead;
		return head;
	}
		
	}
	
	public static void main(String ar[])
	{
		Node<Integer> N =takeInput();
		Node<Integer> temp=N;
		while(temp!=null)
	   {
		System.out.print(temp.data+"->");
		temp=temp.next;

		}
		Node<Integer> res=Insertion(N,3,2);
	     temp=res;
		 System.out.println("Aftert he insertion ");
		while(temp!=null)
	   {
		System.out.print(temp.data+"->");
		temp=temp.next;

		}
		
		
	}
}