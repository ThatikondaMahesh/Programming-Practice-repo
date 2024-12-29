// program to read input from user
import java.io.*;
class Reading
{
		public static void main(String m[])throws IOException
		{   
			InputStreamReader ir=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(ir);
			System.out.println("enter the value");
			int a=br.read();
	        System.out.println("entered the value is "+a);
			
		}
	
	
	
	
	
	
}