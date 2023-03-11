public class HW05 {
    public static void main(String[] args) {
//        Задачи на циклы, вывести следующие строки с соответствующим форматированием (как пирамиды):
//        Задача №1
//
//        0  1  2  3  4  5  6  7  8  9
//        0  1  2  3  4  5  6  7  8
//        0  1  2  3  4  5  6  7
//        0  1  2  3  4  5  6
//        0  1  2  3  4  5
//        0  1  2  3  4
//        0  1  2  3
//        0  1  2
//        0  1
//        0
//        int k = 10;
//        for (int i = 0; i < 10; i++) {
//            System.out.println();
//            k--;
//            for (int j = 0; j <= k; j++) {
//                System.out.print(" " + j);
//            }
//        }

//        Задача №2
//
//        Задача №2
//
//        0  1  2  3  4  5  6  7  8  9
//            0  1  2  3  4  5  6  7  8
//                0  1  2  3  4  5  6  7
//                    0  1  2  3  4  5  6
//                        0  1  2  3  4  5
//                            0  1  2  3  4
//                                0  1  2  3
//                                     0  1  2
//                                        0  1
//                                            0
//        int k = 10;
//        for (int i = 0; i < 10; i++) {
//            System.out.println();
//            System.out.print("  ".repeat(i));
//            k--;
//            for (int j = 0; j <= k; j++) {
//                System.out.print(" " + j);
//            }
//        }




//        Задача №3
//
//        9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
//        8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
//        7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
//        6 5 4 3 2 1 0 1 2 3 4 5 6
//        5 4 3 2 1 0 1 2 3 4 5
//        4 3 2 1 0 1 2 3 4
//        3 2 1 0 1 2 3
//        2 1 0 1 2
//        1 0 1

//        0
        int k = 10;
        for (int i = 0; i < 10; i++) {
            System.out.println();
            System.out.print("  ".repeat(i));
            k--;
            for (int j = k; j >= 0; j--) {
                System.out.print(" " + j);
            }
            for (int l = 1; l <= k; l++) {
                System.out.print(" " + l);
            }
        }
    }
}