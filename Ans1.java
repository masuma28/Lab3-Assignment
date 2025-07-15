package Q;

import java.util.Random;

public class Ans1 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random rand = new Random();
        int maxRow = 0, maxCol = 0;
        int maxRowSum = 0, maxColSum = 0;

        // Fill array and print it
        for (int i = 0; i < 4; i++) {
            int rowSum = 0;
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = rand.nextInt(2); // 0 or 1
                System.out.print(matrix[i][j]);
                rowSum += matrix[i][j];
            }
            System.out.println();
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
                maxRow = i;
            }
        }

        // Check columns
        for (int j = 0; j < 4; j++) {
            int colSum = 0;
            for (int i = 0; i < 4; i++) {
                colSum += matrix[i][j];
            }
            if (colSum > maxColSum) {
                maxColSum = colSum;
                maxCol = j;
            }
        }

        System.out.println("The largest row index: " + maxRow);
        System.out.println("The largest column index: " + maxCol);
    }
}
            