import java.util.*;
import java.lang.*;

class Main1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- >0)
		{
			int m=sc.nextInt();
			int n=sc.nextint();
			
			boolean flag=false;
			for(int i=m;i<=n;i++)
			{
				flag=true;
				for(int j=2;j*j<=i;j++)
				{
					if(i%j==0)
					{
						flag=false;
						break;
					}
					
				}
				if(flag)
				 System.out.println(i);
			}
			
			System.out.println();
			
		}
		
		
	}
}