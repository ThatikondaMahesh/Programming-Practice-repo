
import java.util.*;

public class StringsEx 
{
    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int k=sc.nextInt();
        int mun=helper(n, k);
        System.out.println(mun);
        sc.close();

    }
    public static int helper(int n,int k)
    {
        if(n==1)
        {
            return 0;
        }

        return (helper(n-1, k)+k)%n; // josephus problem  recursice roman killing process by killing factor; 
    }

    
}
