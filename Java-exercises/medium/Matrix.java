import java.util.Scanner;

class Matrix {
    public static void main(String ar[]) {
        System.out.println("Enter the matrix 1 size");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Enter the matrix 2 size");
        int p = sc.nextInt();
        int q = sc.nextInt();

        if (n != p) {
            System.out.println("Matrix multiplication is not possible");
        } else {
            int a[][] = new int[m][n];
            int b[][] = new int[p][q];
            int c[][] = new int[m][q];

            System.out.println("Enter the matrix 1 elements");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("Enter the matrix elements " + i + "," + j);
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter the matrix 2 elements");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.println("Enter the matrix elements " + i + "," + j);
                    b[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    for (int k = 0; k < p; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            System.out.println("After the Matrix multiplication ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(c[i][j] + "    ");
                }
                System.out.println();
            }
        }
    }
}
