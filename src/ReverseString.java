public class ReverseString {

    public static void main(String[] arg) {

        String sentence = "Hello from the north";
        System.out.println(sentence);
        reverseString(sentence);
    }

    //Reversed string
    private static void reverseString(String sentence) {

        String[] temp = sentence.split(" ");


        for (int i = 0; i < temp.length; i++) {

            char[] s1 = temp[i].toCharArray();

            for (int j = temp[i].length() - 1; j >= 0; j--) {
                System.out.print(s1[j]);
            }
            System.out.print(" ");
        }

    }
}
