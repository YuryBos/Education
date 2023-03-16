package _2023_02_09_Task;

import java.util.Arrays;
import java.util.stream.IntStream;

public class HW {
    public static void getTwoNumbers(int[] arr1, int num) {
        separ();
        // Дан массив и число n, надо:
        // вывести два числа, сумма которых равна n
        // если таких чисел нет, то вывести сообщение, что таких чисел нет
        // [1, 5, 4, 8, 9, 3, 2, 6] n = 13

        // *вывести все пары чисел, сумма которых равна n
/*
        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] > num) {
                i++;
            } else if (arr1[i] + arr1[i + 1] == num) {
                System.out.println("Pair with given sum " + num + " is (" + arr1[i] + ", " + arr1[i + 1] + ")");
            }

        }

*/
/*        for (int i = 0, j = i + 1; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                j++;
                i = 0;
            }
            if (j == arr1.length) {
                break;
            }
            if (arr1[i] + arr1[j] == num) {
                System.out.println("Pair with given sum " + num + " is (" + arr1[i] + ", " + arr1[j] + ")");
            }
        }
*/

            IntStream.range(0, arr1.length).forEach(i -> // Перебираем все элементы массива и ищем пару для каждого элемента массива (кроме последнего)
                    IntStream.range(i + 1, arr1.length) // Перебираем все элементы массива, начиная с i + 1 (чтобы не сравнивать элемент с самим собой) и ищем пару для каждого элемента массива с помощью IntStream.range и IntStream.filter
                            .filter(j -> arr1[i] + arr1[j] == num) // Проверяем, что сумма элементов на позициях i и j равна num с помощью IntStream.filter и IntStream.forEach
                            .forEach(j -> System.out.println("Pair with given sum " + num + " is (" + arr1[i] + ", " + arr1[j] + ")")) // Выводим пару с помощью IntStream.forEach и System.out.println (для каждого элемента массива) или IntStream.forEach и System.out.print (для всех элементов массива)  и выводим пару с помощью IntStream.forEach и System.out.println (для каждого элемента массива) или IntStream.forEach и System.out.print (для всех элементов массива)
            );

            /*        Arrays.sort(arr1); // Сортируем массив

        int print = 0;
        int left = 0;
        int right = arr1.length - 1; // Устанавливаем левую и правую границы массива

        while (left < right) { // Пока левая граница не совпадет с правой
            // Следующая строка для отладки программы и вывода значений переменных на каждой итерации цикла while
            System.out.println("left: " + arr1[left] + " right: " + arr1[right]);
            int sum = arr1[left] + arr1[right]; // Сумма чисел на левой и правой границе массива
            if (sum == num) { // Если сумма равна n, то выводим пару чисел
                System.out.println("Pair found: " + arr1[left] + ", " + arr1[right]);
                left++; // Сдвигаем левую границу вправо
                print++; // Счетчик для вывода сообщения, что таких чисел нет
            } else if (sum < num) { // Если сумма меньше n, то сдвигаем левую границу вправо
                left++;
            } else { // Если сумма больше n, то сдвигаем правую границу влево
                right--;
            }
        }
        if (print == 0) {
            System.out.println("No pair found");
        }*/
    }


    public static boolean isDuplicated(int[] arr2) {
        separ();
        // проверить есть ли в массиве повторяющиеся числа

        Arrays.sort(arr2); // Сортируем массив

        for (int i = 0; i < arr2.length - 1; i++) { // Проверяем каждый элемент массива на совпадение со следующим
            if (arr2[i] == arr2[i + 1]) {
                return true;
            }
        }
        return false;
    }


    public static int getMinSequence(int[] nums, int n) {
        separ();
        // Дан массив, надо:
        // вернуть длину минимальной последовательности чисел, сумма которых равна n
        // в массиве все числа положительные
        // [1, 1, 5, 4, 1, 9, 2, 4, 6] n = 11

        int sum = 0;
        int minSec = Integer.MAX_VALUE;
        int counter = 0;
        int startIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; // Считаем сумму элементов в последовательности
            counter++; // Считаем количество элементов в последовательности
            if (sum == n) {
                sum = 0; // Обнуляем сумму элементов в последовательности
                minSec = Math.min(minSec, counter); // Сравниваем длину последовательности с минимальной длиной и записываем минимальное значение
                counter = 0; // Обнуляем количество элементов в последовательности
                startIndex += 1;
                i = startIndex - 1; // Переходим к следующему элементу массива и начинаем считать сумму с него. "-1" потому что в конце цикла for происходит i++
            } else if (sum > n) {
                startIndex += 1;
                sum = 0;
                counter = 0;
                i = startIndex - 1;
            }
        }
        return minSec;
    }

    private static void separ() {
        System.out.println();
        System.out.println("***********************");
        System.out.println("Output of the task:");
        System.out.println();
    }

}