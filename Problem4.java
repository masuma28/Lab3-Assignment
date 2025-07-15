import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = new String[5];
        System.out.println("Enter 5 words:");
        for (int i = 0; i < 5; i++) {
            words[i] = sc.nextLine();
        }

        Arrays.sort(words); // Lexicographical sort
        System.out.println("Sorted:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

