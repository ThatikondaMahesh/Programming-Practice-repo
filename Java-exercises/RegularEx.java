// program to demo onthe 
import java.util.regex.*;


class RegularEx
{
	public static void main(String a[])
	{
		Pattern p=Pattern.compile("\\w+@\\w+[.]\\w+");
		String s="maheshjhy@gmail.com";
		Matcher m=p.matcher(s);
		System.out.println("find method()  "+m.find());
		System.out.println("find method()  "+m.start());
		System.out.println("matches()  "+   m.matches());
	}
	
	
	
}