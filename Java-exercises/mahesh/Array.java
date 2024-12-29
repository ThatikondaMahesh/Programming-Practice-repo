// program to one dimension array
import java.util.*;
class Array
{
	public static void main(String m[])
	{
		 int i,tot=0;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		System.out.println("entered the size of the array  "+n);	
		int ar[]=new int[n];
	    System.out.println("enter the array emlements");
			
		for(i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
			
			}
		
		for(i=0;i<n;i++)
		{ System.out.println("marks in "+(i+1)+"is "+ar[i]);
			tot+=ar[i];
		}
		float per=tot/n;
	      System.out.println("total precentage = "+per);
		  
	}
	
	
}