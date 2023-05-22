package Algorithms._2023_05_22;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
                int[] list = {3,1,2,0,5};
                System.out.println(Arrays.toString(insertionSort(list)));

            }
            public static int[] insertionSort(int[] array) {
                for (int i = 2; i < array.length; i++) {
                    int key = array[i];

                    while (i >= 1 && array[i - 1] > key) {
                        array[i] = array[i - 1];
                        i = i - 1;
                    }
                    array[i] = key;
                }
                return array;
            }


        }