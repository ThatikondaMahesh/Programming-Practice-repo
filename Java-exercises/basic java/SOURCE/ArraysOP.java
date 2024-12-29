import java.util.*;

public class ArraysOP {
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

        System.out.println("enter the pos ");
        int pos = sc.nextInt();
        size=insert(arr, size, newe, pos);

    }

    public static int  insert(int arr[], int size, int newe, int pos) {
        int i = 0;
        for (i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[i] = newe;

        size++;
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        return size;

    }

}
