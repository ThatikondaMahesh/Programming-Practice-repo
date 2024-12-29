import java.util.Scanner;

public class PushZeros {
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
            int z=0;
            int nz=0;
            while (z<arr.length) 
            {
                if(arr[z]!=0)
                {
                int temp=arr[z];
                arr[z]=arr[nz];
                arr[nz]=temp; 
                 nz++;
                }
                z++;
            }
            System.out.println("After updaring the values!");
            for(int i:arr)
            {
                System.out.print(i+" ");
            }
            
        }
    
}


    

