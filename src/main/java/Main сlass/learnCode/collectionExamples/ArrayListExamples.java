package collectionExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(20);
//        list.add(50);
//        list.add(null);
////        list.add(3, 500);
//        System.out.println(list);

//        list.remove(3);
//        list.remove(Integer.valueOf(20));
//        System.out.println(list);

//        list.set(1, 200);
//        System.out.println(list);

//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(2);
//        list2.add(2);
//        list2.add(2);
//        list2.add(2);
//
//        list2.trimToSize();
//
//        System.out.println(list2);

        // original
//        int[] arr = {1,2,3,4,5};
//        List list3 = Arrays.asList(arr);
//        list3.add(6);
//        System.out.println(list3);

//        Integer[] arr = {1,2,3,4,5};
//        List<Integer> list3 = new ArrayList<>();
//        Collections.addAll(list3, arr);
//        list3.add(100);
////        list3.set(0, 1000);
//        System.out.println(list3);

        // template 1
        // 1.у вас есть список строковых значений, и вы должны вернуть список со всеми
        // этими строковыми значениями в нижнем регистре (или в верхнем регистре)

//        List<String> listString = new ArrayList<>();
//        listString.add("Alex");
//        listString.add("Maria");
//        listString.add("Bob");
//
//        System.out.println(listString);
//        System.out.println(transform(listString));
//
//        System.out.println(listString.get(0));

        // 2. у вас есть список значений int и вы должны вернуть список, каждое значение
        // которого умножается на 2

//        List<Integer> listInt = new ArrayList<>();
//        listInt.add(1);
//        listInt.add(22);
//        listInt.add(13);
//
//        System.out.println(listInt);
//        System.out.println(transform2(listInt));
//        System.out.println(listInt.get(1));

        // 3. у вас есть список значений String, и вы должны вернуть список длины каждого из этих
        // значений String.

//        List<String> stringList = new ArrayList<>();
//        stringList.add("3. у вас есть список значений String,");
//        stringList.add("и вы должны вернуть список длины каждого из этих ");
//        stringList.add("значений String.");
//
//        System.out.println(stringList);
//        System.out.println(transform4(stringList));

        // template 2.
        // 1. у вас есть список значений int и вы должны вернуть список, содержащий
        // только нечетные числa


        List<Car> list = new ArrayList<>();
        list.add(new Car(5, 1300, "audi"));
        list.add(new Car(3, 1100, "bmw"));
        list.add(new Car(1, 1350, "mercedes"));

        System.out.println(list);
        System.out.println(transform5(list));
        System.out.println("Суммарный вес автомобилей: " + transform6(list));
        System.out.println("Вес отфильтрованных авто: " + transform6(transform5(list)));
    }

    public static List<Car> transform5(List<Car> list) {
        List<Car> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() < 4)
                result.add(list.get(i));
        }

        return result;
    }

    public static int transform6(List<Car> list) {
        int result = 0;

        for (Car c : list)
            result += c.getWeight();

        return result;
    }

    public static List<Integer> transform4(List<String> list) {
        List<Integer> result = new ArrayList<>();

        for (String s : list)
            result.add(s.length());

        return result;
    }

    public static List<Integer> transform2(List<Integer> list) {
//        List<Integer> result = new ArrayList<>();

//        for (Integer i : list)
//            result.add(i * 2);
//
//        return result;

        for (int i = 0; i < list.size(); i++)
            list.set(i, list.get(i) * 2);

        return list;
    }


    public static List<String> transform(List<String> list) {

        for (int i = 0; i < list.size(); i++)
            list.set(i, list.get(i).toUpperCase());

        return list;
    }

    public static void test(int... a) {
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);
    }
}

class Car {
    private int age;
    private int weight;
    private String model;

    public Car(int age, int weight, String model) {
        this.age = age;
        this.weight = weight;
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "(model:" + model + ", age:" + age + ", wights: " + weight + ")";
    }
}