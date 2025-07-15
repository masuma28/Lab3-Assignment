import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        int[][] arr = {
                {39, 27, 11, 42},
                {54, 96, 91, 60},
                {27, 38, 86, 99},
                {44, 66, 75, 89}
        };

        int column = 2; // sort by 3rd column (index 2)

        Arrays.sort(arr, Comparator.comparingInt(a -> a[column]));

        // Print sorted matrix
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}

