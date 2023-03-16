public class HomeWork07122022 {

    public static void main(String[] args) {
        /*
        Представьте, что Вы живёте в Бурдж-Халифе, количество этажей - 163.
        Ваш лифт работает нестабильно (вот такой вот курьёз) - поднимаясь на каждые 5 этажей,
        он спускается на 1 этаж. Разработайте алгоритм, с помощью которого Вы смогли бы
        определить за сколько таких итераций (1 итерация: 5 этажей вверх, 1 - вниз) можно
        добраться до самого верхнего этажа.

        Необходимо сделать 3 метода, в первом из них рассчитывается через цикл for, во втором
        - через цикл while, в третьем - через цикл do-while.
        Принимаем тот факт, что уровень земли это 0й этаж. А так же, если до верха остается
        менее 5 этажей, то лифт сможет проехать нужный ему промежуток.
         */

        int max = 163;

        forLoop(max);
        whileLoop(max);
        doWhileLoop(max);
    }

    public static void forLoop(int max) {
        int counter = 0;

        for (int floor = 0; floor < max; floor = floor + 4)
            counter++;

        System.out.println("For: " + counter);
    }

    public static void whileLoop(int max) {
        int counter = 0;

        int floor = 0;
        while (floor < max) {
            counter++;
            floor = floor + 4;
        }

        System.out.println("While " + counter);
    }

    public static void doWhileLoop(int max) {
        int counter = 0;

        int floor = 0;
        if (floor < max) {
            do {
                counter++;
                floor = floor + 4;
            } while (floor < max);
        }

        System.out.println("While " + counter);
    }
}
