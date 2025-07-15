public class Problem3 {
    public static void main(String[] args) {
        int[][] hours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        int[] total = new int[8];
        for (int i = 0; i < 8; i++) {
            int sum = 0;
            for (int j = 0; j < 7; j++) {
                sum += hours[i][j];
            }
            total[i] = sum;
        }

        // Bubble sort by total hours (descending)
        for (int i = 0; i < total.length - 1; i++) {
            for (int j = 0; j < total.length - 1 - i; j++) {
                if (total[j] < total[j + 1]) {
                    int temp = total[j];
                    total[j] = total[j + 1];
                    total[j + 1] = temp;

                    int[] tempRow = hours[j];
                    hours[j] = hours[j + 1];
                    hours[j + 1] = tempRow;
                }
            }
        }

        // Display
        for (int i = 0; i < 8; i++) {
            System.out.print("Employee " + i + ": " + total[i] + " hours\n");
        }
    }
}