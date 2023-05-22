package Algorithms._2023_05_22;

import java.util.Arrays;

public class ArrayStoneSorting {

    public static void main(String[] args) {
        // сортировка "камнем" - если
        int[] list = {3, 1, 2, 0, 5};
        System.out.println(Arrays.toString(stoneSort(list)));
    }
    public static int[] stoneSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean change = false; // флаг, если массив отсортирован после первых проходов
            for (int j = arr.length - 2; j >= i; j--) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // change = true;
                }
            }
        }
        return arr;
    }
}