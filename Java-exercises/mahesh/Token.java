// program to read  
import java.io.*;
import java.util.*;

class Employee
{
	public static void main(String m[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the employee names");
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str,","); // splitting the string
		String s1=st.nextToken();
		String s2=st.nextToken(); //collecting string s
		String s3=st.nextToken();
		s1=s1.trim();
		s2=s2.trim();
		s3=s3.trim();		//spaces removing 
		
		int age=Integer.parseInt(s2);
		float sal=Float.parseFloat(s3);
		// display the out
		System.out.println("name: "+s1);
		System.out.println("age: "+s2);
		System.out.println("salary: "+s3);
		
	}
	
	
	
}