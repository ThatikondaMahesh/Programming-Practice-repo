//program to create a class and object
class Sub
{
	void display()
	{
		System.out.println("Hello this is OOPS ");
		
		
	}
	
}
 
class Classs
{
	public static void main(String a[])
	{
		Sub s=new Sub();
		s.display();
		System.out.println(s);
		
		System.out.println(s.hashCode());
		
		
		
	}
	
	
}