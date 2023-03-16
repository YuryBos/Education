package Practice._2023_02_24_HW;

public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 10; // число строк в треугольнике Паскаля

        int[][] pascalTriangle = new int[rows][]; // создаем двумерный массив

        for (int i = 0; i < rows; i++) {
            pascalTriangle[i] = new int[i + 1]; // каждая строка массива имеет длину, равную номеру строки
            pascalTriangle[i][0] = 1; // первый элемент в строке всегда равен 1
            pascalTriangle[i][i] = 1; // последний элемент в строке всегда равен 1

            for (int j = 1; j < i; j++) { // заполняем остальные элементы строки
                pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j]; // сумма двух элементов, расположенных над текущим элементом в строке выше
            }
        }

        for (int i = 0; i < rows; i++) {  // выводим треугольник Паскаля
            for (int j = 0; j < rows - i; j++) {  // выводим пробелы перед числами
                System.out.print(" "); // чтобы треугольник был выровнен по центру
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(pascalTriangle[i][j] + " "); // выводим элементы строки
            }

            System.out.println();
        }
    }
}