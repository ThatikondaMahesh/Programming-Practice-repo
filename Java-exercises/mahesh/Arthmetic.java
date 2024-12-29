// program to read  
import java.io.*;
import java.util.*;

class Employee
{
	public static void main(String m[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Numbers for stk");
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str," "); // splitting the string
		String s1=st.nextToken();
		String s2=st.nextToken(); //collecting string s
		
		s1=s1.trim();
		s2=s2.trim();
				//spaces removing 
		
		int a=Integer.parseInt(s1);
		float  b=Float.parseFloat(s2);
		// display the out
		System.out.println("add: "+(a+b));
		System.out.println("sub: "+(a-b));
		System.out.println("mul: "+(a*b));
		System.out.println("Div: "+(a/b));
		System.out.println("MOd: "+(a%b));
	}
	
	
	
}