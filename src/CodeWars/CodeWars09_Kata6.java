package CodeWars;

/*
The goal of this exercise is to convert a string to a new string where each character in the new string
is "(" if that character appears only once in the original string, or ")" if that character appears more
than once in the original string. Ignore capitalization when determining if a character is a duplicate.
Examples

"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))(("

 */
public class CodeWars09_Kata6 {
    static String encode(String word) {
        StringBuilder newWord = new StringBuilder();
        String WordNew = word.toLowerCase();
        for (char j : WordNew.toCharArray()) {
            int count = WordNew.length() - WordNew.replace(String.valueOf(j), "").length();
            if (count > 1) {
                newWord.append(')');
            } else {
                newWord.append('(');
            }
        }
        return newWord.toString();
    }
    public static void main(String[] args) {
        System.out.println(encode("Success"  ));
    }
}
