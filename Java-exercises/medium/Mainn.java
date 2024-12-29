// calling one main from another main
class Sub
{
	public static void main(String A[])
	{
		for(String s:A)
		{
			System.out.println(s);	
		}	
	}	
}
class Mainn
{
	public static void main(String ard[])
	{
		
		
		String a[]={"hi","hello","no","big"};
		Sub.main(a);
		
	}
	
	
	
}