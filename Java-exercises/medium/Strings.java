//program to demo onstring operations 
class Strings
{
	
	public static void main(String aer[])
	{
		String a="hi java";
		String b=new String("hello");
		System.out.println(a.concat(b));
		System.out.println(a.substring(4));
		System.out.println(a.length());
		System.out.println(a.compareTo(b));
		System.out.println(a.compareToIgnoreCase(b));
		System.out.println(a.equals(b));
		System.out.println(a.startsWith("h"));
		String A[]=a.split(" ");
		for(int i=0;i<A.length;i++)
			System.out.println(A[i]);
		
		
		
	}
	
}