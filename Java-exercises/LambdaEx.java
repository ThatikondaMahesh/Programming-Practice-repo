//program to demo onthe  lambda exp
interface Test
{
	void add(int x,int y);
}
class Demo
{
	static void execute(Test t,int x,int y)
	{
		t.add(x,y);	
	}
	
}
class LambdaEx
{
	public static void main(String a[])
	{
		Test t;
		t=(int x,int y)->{int res=x+y;System.out.println("result is"+res);};
		Demo.execute(t,60,90);
	}
	
}