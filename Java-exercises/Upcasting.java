// program to demo on the upcasting
class Parent 
{
	int p=90;
	void show()
	{
		System.out.println("parent method ");
	}
	
}
class Child extends Parent
{
	int m=90;
	void child()
	{
		System.out.println("child class");
		
	}
	
	 
}
class Upcasting
{
    public static void main(String ar[])
	{
		Parent obj;
	    Child c ;//= new Child();
		//obj=c;
	    //obj.show();
		//obj.child();
		Parent pp = new Child();
		c=(Child)pp;
		c.child();
		c.show();
	  
	}
}