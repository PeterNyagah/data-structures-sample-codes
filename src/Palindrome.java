import java.util.Scanner;

public class Palindrome {

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to check if its a palindrome! ");
        String word = input.nextLine();
        word = word.toLowerCase();

        System.out.println(is_palindrome(word));
    }

    public static boolean is_palindrome(String word) {

        int i = 0;
        int j = word.length() - 1;


        while (j > i) {

            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
