package Basic.Training;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[70][70];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length;
                 j++) {
                array[i][j] = (int) (Math.random() * 5000);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();

        // сортировка массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i].length - 1; k++) {
                    if (array[i][k] > array[i][k + 1]) {
                        int temp = array[i][k];
                        array[i][k] = array[i][k + 1];
                        array[i][k + 1] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // ввести значение числа
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа");
        int number = scanner.nextInt();
        scanner.close();

        // найти число numer в массиве
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length;
                 j++) {
                if (array[i][j] == number) {
                    System.out.println("Числа " + number + " находиться в массиввоз массивоз " + i + " строкой и " + j + " столбце");
                }
            }
        }
    }

}
