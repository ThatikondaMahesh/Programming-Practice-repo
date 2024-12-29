

import java.util.Scanner;

public class TwoPointer 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter capacity");
        int num = sc.nextInt();
        int[] arr = new int[num];
        
        for (int i = 0; i < num; i++) {
            System.out.print("\nenter the eelements");
            arr[i] = sc.nextInt();
        }
        reverse(arr);
    }
        public static void reverse(int[] arr)
        {
            int l=0;
            int r=0;
            while (l<=r) 
            {
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp; 
                l++;
                r--;
            }
            System.out.println("After updaring the values!");
            for(int i:arr)
            {
                System.out.print(i+" ");
            }
            
        }
    
}
