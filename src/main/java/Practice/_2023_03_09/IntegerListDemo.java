package _2023_03_09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IntegerListDemo {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // добавление в начало
        list.add(0, 0);
        // добавление в конец
        list.add(list.size(), 5);
        // узнаем длину списка
        System.out.println(list.size());
        // удаляем элемент по индексу
        list.remove(0);
        // удаляем элемент без индекса
        list.remove(Integer.valueOf(5));
        // узнаем пустой список или нет
        System.out.println(list.isEmpty()); // если пустой, то true
        // обходим список и выводим на консоль каждый элемент
        for (Integer i : list) {
            System.out.println(i);
        }
        // 2) Могут ли реализации интерфейса java.util.List хранить одинаковые элементы (дубликаты)?
        // Да, могут. Например, ArrayList.
        ArrayList <Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        System.out.println("***");
        // 3) создать List наполнить его 10М> элементами
        // При наполнении списка  сохраняем i- тый элемент в переменную temp
        ArrayList <Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            list3.add(i);
            int temp = list3.get(i);
        }
        // замер времени
        long start = System.currentTimeMillis();
        // перебираем список с помощью foreach loop
        for (Integer i : list3) {
            int temp = i;
        }
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println("foreach loop " + timeConsumedMillis);
        // classic for и вызываем list.size() для каждой итерации
        start = System.currentTimeMillis();
        for (int i = 0; i < list3.size(); i++) {
            int temp = list3.get(i);
        }
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start;
        System.out.println("classic for " + timeConsumedMillis2);
        // classic for, но list.size() определяем в переменную
        start = System.currentTimeMillis();
        int size = list3.size();
        for (int i = 0; i < size; i++) {
            int temp = list3.get(i);
        }
        long finish3 = System.currentTimeMillis();
        long timeConsumedMillis3 = finish3 - start;
        System.out.println("classic for, list.size() определяем в переменную " + timeConsumedMillis3);
        // classic for, list.size() определяем в переменную, перебираем с конца (i--)
        start = System.currentTimeMillis();
        int size2 = list3.size();
        for (int i = size2 - 1; i >= 0; i--) {
            int temp = list3.get(i);
        }
        long finish4 = System.currentTimeMillis();
        long timeConsumedMillis4 = finish4 - start;
        System.out.println("classic for, list.size() определяем в переменную, перебираем с конца (i--) " + timeConsumedMillis4);
        // используя Itertor
        start = System.currentTimeMillis();
        Iterator<Integer> iterator2 = list3.iterator();
        while (iterator2.hasNext()) {
            int temp = iterator2.next();
        }
        long finish5 = System.currentTimeMillis();
        long timeConsumedMillis5 = finish5 - start;
        System.out.println("Iterator " + timeConsumedMillis5);
        // используя ListIterator
        start = System.currentTimeMillis();
        ListIterator<Integer> iterator = list3.listIterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
        }
        long finish6 = System.currentTimeMillis();
        long timeConsumedMillis6 = finish6 - start;
        System.out.println("ListIterator " + timeConsumedMillis6);

    }
}
