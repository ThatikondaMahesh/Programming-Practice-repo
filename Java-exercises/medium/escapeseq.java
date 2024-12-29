//program to intro java 
class escapeseq
{
	static int a=12,n=67,c=90;
	public static void main(String args[])
	{
	   
		System.out.println("the sumof the three numbers is\t "+(a+n+c));
		System.out.println("wel\ncome");
		System.out.println("wel\n\ncome\rhow \b");
		operator();
		
	}
	 public  static void operator()
	{
		//int a=12,n=67,c=90;
		System.out.println("the the sumof the three numbers is\t "+(a+n+c));
		System.out.println("the the subof the three numbers is\t "+(a-n-c));
		System.out.println("the the mulof the three numbers is\t "+(a*n*c));
		System.out.println("the the div of the three numbers is\t "+(a/n/c));
		System.out.println("the the bitwise operator the three numbers");
		System.out.println("&"+(a&c));
		System.out.println("^"+(a^c));
		System.out.println("|"+(a|c));
		System.out.println("&"+(~c));
		System.out.println(">>"+(a>>c));
		System.out.println(">>>"+(a>>>c));
		System.out.println("<<"+(a<<c));
		int x=(a>c)?a:c;
		System.out.println("& isop"+(x));
	}
	
} 