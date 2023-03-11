package HW06;

public class HW06_2 {
    public static void main(String[] args) {

//        Задача №1
//
//        Дана строка:
//        String s = “Перестановочный алгоритм быстрого действия”;
//        необходимо вывести все буквы “о” из этой строки.
//                Для указанной строки ответ будет “ооооо” (или в столбик)

        String str = "Перестановочный алгоритм быстрого действия";
        char [] charS = str.toCharArray();
        for (int i = 0; i < charS.length; i++) {
            if (charS[i] == 'о') {
                System.out.print(charS[i]);
            }
        }

//        Задача №2
//
//        Дана строка:
//        String s = “Перевыборы выбранного президента”;
//        необходимо подсчитать количество букв “е” в строке.
//        Для указанной строки ответ будет 4.
        byte count = 0;
        String S = "Перевыборы выбранного президента";
        for (char i : S.toCharArray()) {
            if (i == 'е'){
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
        
        
//        Задача №3
//        Дана строка:
//        String s = “Посмотрите как Рите нравится ритм”;
//        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//                Для указанной строки ответ будет 6, 15, 29.

        String SS = "Посмотрите как Рите нравится ритм";
        SS = SS.toLowerCase();
        char [] charSS = SS.toCharArray();
        for (int i = 0; i < charSS.length; i++) {
            if (charSS[i] == 'р') {
                if (charSS[i+1] == 'и') {
                    if (charSS[i+2] == 'т') {
                        System.out.print(i + " ");
                    }
                }
            }
        }

        System.out.println("\nexample:");
        for (int i = 0; i < SS.length() - 2; i++){
            String temp = SS.substring(i, i + 3);
            if (temp.equals("рит")){
                System.out.println(i + " index");
            }
        }




//        Экстра задача
//
//        Дан массив:
//        String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
//        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count1 = 0;
        for (String[] strings : array) {
            for (String string : strings) {
                boolean A = string.contains("е");
                if (!A) {
                    count1++;
                }
            }
        }
        System.out.println("количество строк которые не содержат 'e' равно " + count1);
    }
}
