import java.util.*;
public class Hello {


	public static void main(String[] args)
	 {
		 	Scanner sc=new Scanner(System.in);
			int N=sc.nextInt();
			int i=N;
			while(i>0)
			{
				int j=i;
				while(j>0)
				{
					System.out.print(j);
                    System.out.print(' ');
					j--;
				}
				i--;
				System.out.println();

			}


			i=1;
			while(i<N)
			{
				int j=i+1;
				while(j>0)
				{
					System.out.print(j);
                    System.out.print(' ');
					j--;
				}
				i++;
				System.out.println();

			}
		
	}

}
