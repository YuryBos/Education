package Algorithms._2023_05_22;

import java.util.Arrays;

public class ArrayBubblSort {

    public static void main(String[] args) {
        // сортировка "пузырьком" - если
        int[] list = {3, 1, 2, 0, 5};
        System.out.println(Arrays.toString(bubbleSort(list)));
    }
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean change = false; // флаг, если массив отсортирован после первых проходов
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    change = true;
                }
                if (!change) {
                    break;
                }
            }
        }
        return arr;
    }
}