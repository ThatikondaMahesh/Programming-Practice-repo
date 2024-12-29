// program to implement the stack using the Array
class StackUsingArray
{
	private int []data;
	private int top;
	public StackUsingArray()
	{
	 data=new int[10];
	 top=-1;
	}
	public int size()
	{
		return top+1;
	}
	public void push()
	{
		
	}
	public int pop()
	{
		if(top==-1)
		{
			throw new StackOverflowException();
		}
		
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public int top()
	{
		
		
	}
}