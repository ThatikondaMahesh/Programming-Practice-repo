// program to Demo on the jagged arrays
import java.util.*;
class JaggedArray
{
	public static void main(String ars[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int n=sc.nextInt();
		int a[][]=new int[n][];
		System.out.println("enter the a[0] size");
		int n1=sc.nextInt();
		System.out.println("enter the a[1] size");
		int n2=sc.nextInt();
		a[0]=new int[n1];
		a[1]=new int[n2];
		System.out.println("enter the a[0] elements");
		for(int i=0;i<n1;i++)
		{
			a[0][i]=sc.nextInt();
			
		}
		System.out.println("enter the a[1] elements");
		for(int i=0;i<n2;i++)
		{
			a[1][i]=sc.nextInt();
			
		}
		System.out.println(" a[0] elements are");
		for(int i=0;i<n1;i++)
		{
			System.out.print(a[0][i]+"\t");
		}
		System.out.println("a[1] elementss are");
		for(int i=0;i<n2;i++)
		{
			System.out.print(a[1][i]+"\t");
		}
		
		
	}
	
	
	
}