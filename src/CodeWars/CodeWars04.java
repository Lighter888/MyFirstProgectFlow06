package CodeWars;

public class CodeWars04 {

    public static String removeMy(String str) {
        char [] charArray = str.toCharArray();
        char [] newCharArray = new char[str.length() - 2];
        for (int i = 0; i < charArray.length - 2 ; i++){
            newCharArray[i] = charArray[i + 1];
        }

        return String.copyValueOf(newCharArray);
    }

    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {

        System.out.println(remove("DfgeriltfherW"));
    }
}
