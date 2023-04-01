package CodeWars;

public class CodeWars07 {

        /*
        Create a function that will return a string that combines all of the letters of the three
        inputed strings in groups. Taking the first letter of all of the inputs and grouping them next to each other.
        Do this for every letter, see example below!

    E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"
         */
        public static String tripleTrouble(String one, String two, String three) {

            String str = "";
            for (int i = 0; i < one.length(); i++) {
                str += " " + one.charAt(i) + two.charAt(i) + three.charAt(i);
            }
            return str;
        }
        public static void main(String[] args) {
            System.out.println(tripleTrouble("aaa", "ddd", "fff"));
    }
}
