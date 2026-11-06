import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long current = 1; // Use long to prevent integer overflow during multiplication
        row.add((int) current); //(int) is a type cast because the list stores Integer, while current is a long.
        for (int k = 1; k <= rowIndex; k++) {
            current = current * (rowIndex - k + 1) / k;
            row.add((int) current);
        }
        return row;
    }
    public static void main(String[] args) {
        int rowIndex ;
        PascalTriangleII solution = new PascalTriangleII();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number");
        rowIndex = sc.nextInt();
        List<Integer> result = solution.getRow(rowIndex);
        System.out.println(result); // Output: [1, 3, 3, 1]
    }
}
