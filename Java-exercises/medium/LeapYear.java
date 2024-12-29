//program to check the leap year or not 
import java.io.*;

class LeapYear
{
	public static void main(String ar[]) throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the year");
		int year= Integer.parseInt(br.readLine());
		if(year%400==0 || (year%4==0&&year%100!=0))
			System.out.println("year is leap year"+year);
		else
			System.out.println("not a leap yeaar");
		
		System.out.println("Welcome");
		
	}
	
	
	
	
}