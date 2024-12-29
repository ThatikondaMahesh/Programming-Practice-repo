// program to demo on the fibinocci series
import java.io.*;
class Fibinocci
{
	public static void main(String ar[]) throws IOException
	{
		 InputStreamReader i=new InputStreamReader(System.in);
		 BufferedReader br=new BufferedReader(i);
		 System.out.println("enter the starting number and the ending number ");
		 int n=Integer.parseInt(br.readLine());
		 int a=0,b=1;
		 System.out.print(a+" "+b);
		 System.out.println(a+b);
		 int sum=0;
		 
		 for(int j=2;j<=n;j++)
		 {
			 sum=a+b;
			 a=b;
			 b=sum;
			 System.out.print(sum+" ");
		 }
		
		
		
	}
	
	
	
	
}
