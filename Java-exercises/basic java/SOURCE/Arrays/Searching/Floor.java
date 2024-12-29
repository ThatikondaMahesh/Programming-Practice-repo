import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a[]={21,34,56,78,89,99};
        int low=0;
        int high=a.length-1;
        int  ans=Integer.MIN_VALUE;
        int target=36;
        while (low<=high) 
        {
            int mid=(low+high)/2;

            if(a[mid]<=target)
            {
                if(a[mid]>ans)
                {
                    ans=a[mid];
                }
                high=mid-1;
            }
            else{
                low=mid+1;

            }
        }
            System.out.println(ans);

    }
    
}
