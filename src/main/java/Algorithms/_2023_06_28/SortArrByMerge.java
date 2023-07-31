package Algorithms._2023_06_28;

import java.util.Arrays;

public class SortArrByMerge {
    public static void main(String[] args) {
        int[] array = {4, 2, 3, 8, 7, 6, 1, 3, 5};
        System.out.println(Arrays.toString(array));
        mergeArr(array);

    }

    public static int[] mergeArr(int[] array) {
        int midl = array.length / 2;
        int[] leftArr = Arrays.copyOfRange(array, 0, midl);
        int[] rightArr = Arrays.copyOfRange(array, midl, array.length);
        return compareArr(mergeArr(leftArr), mergeArr(rightArr));
    }

    // сравниваем два сортированных
    public static int[] compareArr(int[] leftArr, int[] rightArr) {
        int[] result = new int[leftArr.length + rightArr.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] < rightArr[j]) {
                result[k] = leftArr[i];
                i++;
            } else {
                result[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < leftArr.length) {
            result[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightArr.length) {
            result[k] = rightArr[j];
            j++;
            k++;
        }
        return result;
    }

//        int j1 = 0;
//        int j2 = 0;
//        int[] result = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//        }
//        return result;
//    }

}
