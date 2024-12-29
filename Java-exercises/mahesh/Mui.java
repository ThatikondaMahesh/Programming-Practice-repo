// matrix mul
import java.util.Scanner;
import java.io.*;

class Mui
{
	public static void main(String arg[]) throws IOException
	{ 	int i,j,k;
	   
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of rows ");
		int m=sc.nextInt();
		System.out.println("enter the no.of cols ");
		int n=sc.nextInt();
		
		System.out.println("enter the no.of rows in 2 matrix");
		int p=sc.nextInt();
		System.out.println("enter the no.of cols in 2 matrix");
		int q=sc.nextInt();
		if(n!=p)
		System.out.println("mul is not possible matrix");	
		else
		{
				int ar[][]=new int[m][n];
				int c[][]=new int[m][n];
			System.out.println(" enter the 1 matrix elements ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
			ar[i][j]=sc.nextInt();
		
			}
			
		}
		int args[][]=new int [p][q];


		System.out.println(" enter the 2 matrix elements ");
		
		
		for(i=0;i<p;i++)
		{
			for(j=0;j<q;j++)
			{
				args[i][j]=sc.nextInt();
		
			}
		}
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{  
			        for(k=0;k<p;k++)
					{
				      c[i][j]+=ar[i][k]*args[k][j];	
					
					}

				}
				
			}
			System.out.println("After the multiplication");
			
			for(i=0;i<m;i++)
		   {
			for(j=0;j<q;j++)
			{
				System.out.print(c[i][j]+"	");
			}
			System.out.println();
			
			
		}
			
	
    }
}
}	