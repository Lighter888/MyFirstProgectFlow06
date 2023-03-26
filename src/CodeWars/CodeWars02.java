package CodeWars;

public class CodeWars02 {


    /*
    Check to see if a string has the same amount of 'x's and 'o's.
    The method must return a boolean and be case insensitive. The string can contain any char.

Examples input/output:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false

     */
    public static boolean getXO (String str) {
        str = str.toLowerCase();
         int countX = 0;
         int countO = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                countX++;
            }
            if (str.charAt(i) == 'o') {
                countO++;
            }
        }
        return countX == countO;

    }
}
