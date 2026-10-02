
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {

            // Leading spaces
            for (int s = 0; s < (n - i - 1) * 3; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1]
                              + arr[i - 1][j];
                }

                // Fixed width for every number
                System.out.printf("%6d", arr[i][j]);
            }

            System.out.println();
        }

        sc.close();
    }
}