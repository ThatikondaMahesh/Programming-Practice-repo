// program to demo onthe matrix multipli
import java.util.*;
class MatrixMul
{
	public static void main(String ar[])
	{
		System.out.println("enter the matrix 1 size");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println("enter the matrix size");
		int p=sc.nextInt();
		int q=sc.nextInt();
		if(n!=p)
		{
			System.out.println("Matrix multiplication is not opossible");
		}
		else
		{
			int a[][]=new int[m][n];
			int b[][]=new int[p][q];
			int c[][]=new int[m][q];
			
			System.out.println("enter the matrix 1 elements");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.println("enter the matrix  elements"+i+","+j);
				    a[i][j] = sc.nextInt();		
				}

			}
			System.out.println("enter the matrix 2 elements");
			for(int i=0;i<p;i++)
			{
				for(int j=0;j<q;j++)
				{
					System.out.println("enter the matrix  elements"+i+","+j);
			 	   b[i][j] = sc.nextInt();	
				}
			}
			for (int i = 0; i < m; i++)
				{
                for (int j = 0; j < q; j++)
					{c[i][j]=0;
                   for (int k = 0; k < p; k++) 
					{
                        c[i][j] = c[i][j]+a[i][k] * b[k][j];
                    }
                }
            }
			System.out.println("After the Matrix multiplicaton ");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<q;j++)
				{
				   System.out.print(c[i][j]+"	");	
				}
				System.out.println();
				
			}
			
			
			
			
			
		}
		
		
		
		
	}
		
}