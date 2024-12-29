//program to switch case
import java.io.*;
class Switch
{
	public static void main(String m[])
	{   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("enter the choice");
	    int n=Integer.parseInt(br.readLine());
		switch(n)
		{
			case 1:System.out.println("frist statement is executed");
						break;
			case 1:System.out.println("frist statement is executed");
						break;
			case 2:System.out.println("second statement is executed");
						break;
			case 3:System.out.println("third statement is executed");
						break;
			case 4:System.out.println("four statement is executed");
						break;
		    case 5:System.out.println("five statement is executed");
						break;
			
			default:System.out.println("entered the invalid number");
		
		}
		
		
		
		
	}
	

}