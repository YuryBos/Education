package MaiClass._2023_05_23;

import java.util.Set;
import java.util.TreeSet;

public class CatTest {
    public static void main(String[] args) {
        Cat cat1 = new Cat(7, "Black", 3.65);
        Cat cat2 = new Cat(7, "Black", 3.65);

        boolean result = cat1 == cat2;
        System.out.println("Результат сравнения при помощи ==: " + result); // сравнение ссылок

        result  = cat1.equals(cat2);
        System.out.println("Результат сравнения при помощи equals: " + result); //если нет реализации equals в классе Cat - false, поскольку не понятно, что сравнивать

        Set<Cat> cats = new TreeSet<>(new CatComparator());

        cats.add(new Cat(5, "Black", 2.17));
        cats.add(new Cat(9, "White", 3.81));
        cats.add(new Cat(7, "Red", 4.27));
        cats.add(new Cat(3, "Maroon", 2.63));
        cats.add(new Cat(5, "Green", 2.59));
        cats.add(new Cat(2, "Yellow", 5.11));
        cats.add(new Cat(1, "Blue", 2.98));

        for (Cat cat : cats) {
            System.out.println(cat);
        }

        System.out.println();

        Set<Cat> cats1 = new TreeSet<>(new CatComparator());
        cats1.addAll(cats);

        for (Cat cat : cats1) {
            System.out.println(cat);
        }


    }
}
