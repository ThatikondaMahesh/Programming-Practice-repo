// generics classes
class pair<T,M>
{
	private T frist;
	private M second;
	public pair(T frist,M second)
	{
		this.frist=frist;
		this.second=second;
	}
	public T getFrist()
	{
		return frist;
	}
	public M getSecond()
	{
		return second;
	}
	
}
class Generic
{
	public static void main(String ar[])
	{
		//pair<String> p=new pair<>("Mahesh","Maha"); // it expects the objects 
		// primitive datatype are not allowed
		//System.out.println(p.getFrist());
		//pair<Integer> p1=new pair<>(10,20); // it expects the objects 
		// primitive datatype are not allowed
		//System.out.println(p1.getFrist());
		 // if we wont specify the generics it assumes the by default it 
		 pair<Integer,String> p1=new pair<>(766,"Mahesh");
		 System.out.println(p1.getFrist());
		 System.out.println(p1.getSecond());
		 
          		 
	}
}