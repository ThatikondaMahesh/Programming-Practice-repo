// program to dynamic array 
public class DynamicArray
{
	int data[];
	private int nextElementIndex;
	 public DynamicArray()
	{
	 data=new int[5];
	 nextElementIndex=0;
	}
	
	public int size()
	{
		return nextElementIndex;
		
	}
	public int get(int i)
	{
		if(i>=nextElementIndex)
		{
			return 0;
		}
	 return data[i];
	 
	}
	public boolean isEmpty()
	{
		return nextElementIndex==0;
	}
	public void add(int ele)
	{
		if(nextElementIndex==data.length)
		{
			doubleCapacity();
		}
	
	 data[nextElementIndex]=ele;
	 nextElementIndex++;
	}
	private void doubleCapacity()
	{
		int temp[]=data;
		data=new int[2*temp.length];
		for(int i=0;i<temp.length;i++)
		{
		 data[i]=temp[i];
		}
	}
	public void set(int i,int ele)
	{
		if(i>=nextElementIndex)
		{
			return ;
		}
		
	   data[i]=ele;
	  
		
	}
	public int removeLast()
	{
		// ther may choice for empty 
		if(nextElementIndex==0)
		{
			return -1;
		}
		int temp= data[nextElementIndex-1];
	    data[nextElementIndex-1]=0;
		nextElementIndex--;
	    return temp;

	}
	
	
}