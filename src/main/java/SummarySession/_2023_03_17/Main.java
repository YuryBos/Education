package SummarySession._2023_03_17;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int a : array) {
            if (!list.contains(a)) {    // ! - логическое НЕ
                list.add(a);
                array[count] = a;
                count++;
            }
        }
        System.out.println("k = " + list.size() + ", " + Arrays.toString(array));

        // второй способ
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[count] = arr[i + 1];
                count++;
            }
        }
        System.out.println("k = " + count + ", " + Arrays.toString(arr));
    }
}
