import java.util.*;

public class Arrayupdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter capacity");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("enter the elemesize ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("\nenter the eelements");
            arr[i] = sc.nextInt();
        }
        System.out.println("entert the nnumber to be insert");
        int newe = sc.nextInt();

        System.out.println("enter the new value ");
        int pos = sc.nextInt();
        size=update(arr, size, newe,pos);

    }

    public static int  update(int arr[], int size, int newe,int newv) 
    {
        int i = 0;
        for( i=0;i<size;i++)
        {
            if(arr[i]==newe)
            {
                arr[i]=newv;
            }

        }
        arr[i] = newe;
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        return size;

    }

}

