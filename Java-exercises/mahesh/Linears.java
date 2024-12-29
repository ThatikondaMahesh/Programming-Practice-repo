// program to linearsearch
import java.io.*;
import java.lang.*;
  class Linears
{
	public static void main(String args[]) throws IOException
	{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the no.of String ");
	int n=Integer.parseInt(br.readLine());
	String Sr[]=new String[n];
	System.out.println("enter the strings");
	  for(int i=0;i<n;i++)
	  {
		 Sr[i]=br.readLine();
	  }
	    boolean x=false;
		System.out.println("enter the string to be searched");
		String m=br.readLine();
		for(int i=0;i<n;i++)
		{
			if(Sr[i].equals(m))
			{
				System.out.println("found at"+(i+1)+" "+Sr[i]);
						x=true;
			}
		
		}
		if(!x)
			System.out.println("not found the string");
		
	}
	
}