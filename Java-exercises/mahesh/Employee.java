// program to read different data 
import java.io.*;
class Employee
{
	public static void main(String m[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the employee names");
		String str=br.readLine();
		System.out.println("Enter the employee age");
		int age=Integer.parseInt(br.readLine());	
		System.out.println("Enter the employee  gender");
		char ch=(char)br.readLine().charAt(0);
		System.out.println("completed one profile\n");		
		System.out.println("name:"+str);
		System.out.println("age="+age);
		System.out.println("gender="+ch);
		
	}
	
	
	
}