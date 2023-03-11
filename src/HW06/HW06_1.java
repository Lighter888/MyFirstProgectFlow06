package HW06;

import java.util.Arrays;

public class HW06_1 {
    public static void main(String[] args) {
//        Задача №1
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести сумму всех значений массива.

        int[] arr1 = {9, 2, 6, 4, 5, 12, 7, 18, 6, 10, 19};
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        System.out.println(sum);

//        Задача №2
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести максимальное значение массива.

        int max = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max){
                max = arr1[i];
            }
        }
        System.out.println(max);

//                Задача №3
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести минимальное значение массива.
        int[] arr3= {9, 2, 6, 4, 5, 12, 7, -8, 6};
        int min = arr3[0];
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < min){
                min = arr3[i];
            }
        }
        System.out.println(min);

//                Задача №4
//
//        Дан массив:
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        необходимо вывести среднее арифметическое всех значений массива.
        int[] arr4= {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int avr = 0;
        for (int i = 0; i < arr3.length; i++) {
            avr += arr4[i];
            }
        System.out.println((avr * 1.0) /  arr4.length);


//                Задача №5
//
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести сумму элементов массива.
        int summa = 0;
        int[][] arr5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                summa += arr5[i][j];
            }
        }
        System.out.println(summa);

//                Задача №6
//
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести максимальное значение массива.

        int[][] arr6 = {{1, 2, 3, 4, 5, 45, 3}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int maxznach = arr6[0][0];
        for (int i = 0; i < arr6.length; i++) {
            for (int j = 0; j < arr6[i].length; j++) {
                if (arr6[i][j] > maxznach){
                    maxznach = arr6[i][j];
                    }
                }
            }
        System.out.println(maxznach);


//                Задача №7
//
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести количество элементов в массиве.
        int count = 0;
        for (int i = 0; i < arr6.length; i++) {
            for (int j = 0; j < arr6[i].length; j++) {
                count++;
            }
        }
        System.out.println(count);

    }
}
