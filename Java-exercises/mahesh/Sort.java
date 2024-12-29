// program to sort
import java.io.*;
import java.util.*;
class Sort 
{
		public static void main(String m[]) throws IOException
		{
			int i,j,temp;
			boolean s=false;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the size of the array");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("enter the  array elements");
			for(i=0;i<n;i++)
			  a[i]=sc.nextInt();
		  
			for(i=0;i<n-1;i++)
			{
				for(j=0;j<n-i-1;j++)
				{  if(a[j]>a[j+1])
					{
						temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
						s=false;
					}W
					if(s)
						break;
				}
				
				
				
			}
			 System.out.println("After the array is ");
			 for(i=0;i<n;i++)
				 System.out.println(a[i]);
			
			
		}
	
	
	
	
}