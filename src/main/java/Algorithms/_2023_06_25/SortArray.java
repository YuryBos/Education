package Algorithms._2023_06_25;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

//        Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент,
//        который будет находиться на k-й позиции в конечном отсортированном массиве.
//        Массив 1 - 100 112 256 349 770
//        Массив 2 - 72 86 113 119 265 445 892
//        к = 7
//        Вывод : 256
//
//        Окончательный отсортированный массив - 72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
//        7-й элемент этого массива равен 256

        int[] array1 = {100, 112, 256, 349, 770};
        int[] array2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;

        int[] array3 = new int[k];

        int j1 = 0;
        int j2 = 0;

        for (int i = 0; i < k; i++) {
            if (array1[j1] >= array2[j2]) {
                array3[i] = array2[j2];
                j2++;
            } else {
                array3[i] = array1[j1];
                j1++;
            }
        }
        System.out.println(array3[k - 1]);
    }
}
