//  program to transpose of matrix
import java.util.*;
import java.lang.*;

class Transpose
{
	public static void main(String args[]) 
	{ 	int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of rows ");
		int m=sc.nextInt();
		System.out.println("enter the no.of cols ");
		int n=sc.nextInt();
		/*
		System.out.println("enter the no.of rows in 2 matrix");
		int p=sc.nextInt();
		System.out.println("enter the no.of cols in 2 matrix");
		int q=sc.nextInt();
		if(n!=p)
		System.out.println("mul is not possible matrix");	*/
		
			}
			
		}
		System.out.println(" before Transpose of the matrix is ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]+"	");
		
			}
			System.out.println();
			
			
		}
		System.out.println(" Transpose of the matrix is ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(a[j][i]+"	");
		
			}
			System.out.println();
			
			
		}
	}
	
	
	
	
}