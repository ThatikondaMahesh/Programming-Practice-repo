//fibinoci series
import java.io.*;
class Fibinoci
{
	public static void main(String m[])throws IOException
	{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number to up to numberr ");
		int n=Integer.parseInt(br.readLine());
		int a=0,b=1,i,sum;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(i=2;i<n;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(sum+" ");

		}
		
		
		
	}
}