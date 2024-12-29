// program to String buffer
import java.io.*;

class Stringbil
{
	public static void main(String Arg[]) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 StringBuilder s=new StringBuilder(50);
	 System.out.println("enter the surname ");
	 String sur=br.readLine();
	 System.out.println("enter the mid name");
	 String frist=br.readLine();
	 System.out.println("enter the last name ");
	 String lm=br.readLine();
	 s.append(sur);
	 System.out.println(s);
	 s.append(frist);
	 System.out.println(s);
	 s.append(lm);
	 System.out.println(s);
	 s.insert(11,"  ");
	 System.out.println(s);
	 StringBuilder a=s.delete(4,6);
	 System.out.println(a);
	 s.reverse();
	 System.out.println(s);
	 s.toString();
	 System.out.println(s);
	 int n=s.length();
	 System.out.println(n);
	 
	}
	
}