package MaiClass.learnCode;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        /*
    Алгоритм бинарного поиска:

    Начните со среднего элемента в массиве, в качестве ключа поиска.
    Если значение ключа поиска равно элементу, вернуть индекс ключа поиска.
    Если значение ключа поиска меньше элемента, продолжаем поиск в правой половины.
    В противном случае продолжаем поиск в левой половине.
    Если не найден возвращаемся в пункт 2, пока значение не будет найдено или интервал не станет пустым.
         */

//        int[] test = {0,2,3,6,18,21,100};
//        int searching = 18;
//
//        int[] test2 = new int[]{1,2,3,4,10,11};
//        System.out.println(binarySearch(test2, 0, test2.length - 1, 14));
//        System.out.println(binarySearchStd(test2, 0, test2.length - 1, 14));
//        System.out.println(Arrays.binarySearch(test2, 14));

        int[] a = {1,35,6,1,2,3,5,100};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);

    }

    public static int binarySearch(int[] arr, int leftIndex, int rightIndex, int searching) {
        if (rightIndex >= leftIndex) {

            // Начните со среднего элемента в массиве, в качестве ключа поиска.
            int middle = leftIndex + (rightIndex - leftIndex) / 2;

            //Если значение ключа поиска равно элементу, вернуть индекс ключа поиска.
            if (arr[middle] == searching)
                return middle;

            // Если значение ключа поиска меньше элемента, продолжаем поиск в правой половины.
//            if (arr[middle] < searching)
//                return binarySearch(arr, middle + 1, rightIndex, searching);
//
//            // В противном случае продолжаем поиск в левой половине.
//            return binarySearch(arr, leftIndex, middle - 1, searching);

            if (arr[middle] > searching)
                return binarySearch(arr, leftIndex, middle - 1, searching);

            return binarySearch(arr, middle + 1, rightIndex, searching);
        }

        return -1;
    }

    public static int binarySearchStd(int[] arr, int leftIndex, int rightIndex, int searching) {
        int index = -1;
        while (leftIndex <= rightIndex) {
            int middle = leftIndex + (rightIndex - leftIndex) / 2;

            if (arr[middle] == searching) {
                index = middle;
                return index;
            }

            if (arr[middle] > searching)
                rightIndex = middle - 1;
            else
                leftIndex = middle + 1;

//            if (arr[middle] < searching) {
//                leftIndex = middle + 1;
//            } else if (arr[middle] > searching) {
//                rightIndex = middle - 1;
//            } else if (arr[middle] == searching) {
//                return middle;
//            }
        }

        return index;
    }

}
