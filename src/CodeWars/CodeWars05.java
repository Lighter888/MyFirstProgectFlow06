package CodeWars;

/*
"The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"
 */


import java.util.Arrays;

public class CodeWars05 {
    public static String reverseWords(String str) {

        String[] strArray = str.split(" ");
        String[] newStrArray = new String[strArray.length];
        for (int i = strArray.length - 1, j = 0; i >= 0; i--, j++) {
            newStrArray[j] = strArray[i];
        }

        return String.join(" ", newStrArray);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("hi how are you"));
    }

}
