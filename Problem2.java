import java.util.Scanner;

            public class Problem2{
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter password: ");
                    String password = sc.nextLine();

                    if (isValid(password)) {
                        System.out.println("Valid Password");
                    } else {
                        System.out.println("Invalid Password");
                    }
                }

                public static boolean isValid(String pass) {
                    if (pass.length() < 8) return false;

                    int letterCount = 0, digitCount = 0;
                    for (char ch : pass.toCharArray()) {
                        if (Character.isLetter(ch)) letterCount++;
                        else if (Character.isDigit(ch)) digitCount++;
                    }
            return letterCount + digitCount == pass.length() && digitCount >= 2;
        }
    }

