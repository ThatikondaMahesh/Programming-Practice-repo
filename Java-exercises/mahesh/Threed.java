import java.util.Scanner;
import java.io.*;

class Threed
{
	public static void main(String arg[]) throws IOException
	{ 	int i,j,k;
	   
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of dept ");
		int m=sc.nextInt();
		System.out.println("enter the no.of student");
		int n=sc.nextInt();
		System.out.println("enter the no.of Marks");
		int p=sc.nextInt();
		int a[][][]=new int [m][n][p];
		
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				for(k=0;k<p;k++)
				{
				a[i][j][k]=sc.nextInt();
				}
			}
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				for(k=0;k<p;k++)
				{
				System.out.print(a[i][j][k]+"	");
				}
				System.out.println();
			}
		}	System.out.println();

	}
}