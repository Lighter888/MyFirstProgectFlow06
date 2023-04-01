package CodeWars;

public class CodeWars08 {
/*
Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
'word'   =>  'drow'


 */
    public static String solution(String str) {
        String newStr = "";
        int n = str.length();
        for (int i = 0, j = n; i < n; i++, j--) {
            newStr += str.charAt(j-1);
        }
        return newStr;
    }

    public static String solution1(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(solution("HELLO"));
    }
}
