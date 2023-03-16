package Basic.Project;

import java.util.Scanner;

public class HomeWork28112022 {

    public static void printResult(long w) {
        if (w % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }

    public static void printResult(int w) {
        if (w % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }

    public static void workingOn2Arguments(int a, int b) {
        System.out.println("a = " + a + ", b = " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        /*
        1. Напишите метод, который принимает один аргумент и проверяет является ли это
           число четным или нечетным. Результат вывести в консоль.
        2. Напишите метод, который принимает 2 аргумента (числовые) и меняет местами
           значения, хранящиеся в этих двух переменных с помощью третьей переменной.
           Результат вывести в консоль.
         */

        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int w = scanner.nextInt();
        scanner.close();


        workingOn2Arguments(q,w);
    }
}
