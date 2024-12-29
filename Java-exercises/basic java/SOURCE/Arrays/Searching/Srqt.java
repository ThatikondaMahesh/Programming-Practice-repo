import java.util.Scanner;

public class Srqt 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        double s=srqtof(num);
        System.out.println(s);
    }
    
    public static double srqtof(int num)
    {
        double low=0;
        double high=num;
        double pre=0.000000000001;
        while(high-low >pre)
        {
                double mid=(low+high)/2;
                if(mid==num)
                {
                    return mid;

                }
                if(mid*mid<num)
                {
                    low=mid;
                }
                else
                high=mid;
        }

        return low;

    }
    
}
