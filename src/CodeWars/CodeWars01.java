package CodeWars;

import java.util.Arrays;

public class CodeWars01 {

    /*

    In this little assignment you are given a string of space separated numbers,
    and have to return the highest and lowest number.

Examples:

highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"

     */
    public static String highAndLow(String numbers) {
        String[] array = numbers.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int i;
        for (i = 0; i < array.length; i++) {
            if (max < Integer.parseInt(array[i])) {
                max = Integer.parseInt(array[i]);
            }
        if (min > Integer.parseInt(array[i])) {
            min = Integer.parseInt(array[i]);

            }
        }
        return String.format("%d %d", max, min);

    }


    public static void main(String[] args) {
        System.out.println(highAndLow("34 55 2 -2"));
    }
}
