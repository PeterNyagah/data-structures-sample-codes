import java.util.Scanner;

public class PalindromeRecursion {

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a value! ");
        String word = input.nextLine();
        word = word.toLowerCase();

        System.out.println("Is " + word + " a palindrome? " + is_palindrome(word));
    }

    public static boolean is_palindrome(String word) {
        return is_palindrome(0, word.length() - 1, word);
    }

    public static boolean is_palindrome(int i, int j, String word) {

        if (i > j) {
            return true;
        }

        if (word.charAt(i) != word.charAt(j)) {
            return false;
        }

        return is_palindrome(i + 1, j - 1, word);

    }

}