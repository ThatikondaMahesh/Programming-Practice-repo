// program to demo on the linkedList
public class LinkedList
{
	public static Node<Integer> createList()
	{
		Node<Integer> n1=new Node<>(10);
		Node<Integer> n2=new Node<>(20);
		Node<Integer> n3=new Node<>(30);
		Node<Integer> n4=new Node<>(40);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		return n1;
	}
	public static void main(String ar[])
	{
		Node<Integer> N =createList();
		Node temp=N;
		while(temp!=null)
	   {
		System.out.println(temp.data);
		temp=temp.next;

		}
		
	}
}