public class ReverseStringSpecial {

    //Reverse string without moving the position of the special characters
    public static void main(String[] arg) {

//        String str = "a!!!b.c.d,e'f,ghi";
        String str = "a!bcf#s";
        char[] charArray = str.toCharArray();

        System.out.println(str);
        /*  System.out.println(charArray);*/
        reverseArray(charArray);
        String revStr = new String(charArray);

        System.out.println(revStr);

    }

    private static void reverseArray(char str[]) {

        int l = 0;
        int r = str.length - 1;

        while (l < r) {
            if (!Character.isAlphabetic(str[l])) {
                l++;
            } else if (!Character.isAlphabetic(str[r])) {
                r--;
            } else {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;

            }
        }
    }
}
