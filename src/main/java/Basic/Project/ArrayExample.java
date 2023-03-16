import Extended.Person;

import java.util.Arrays;
import java.util.Collections;

public class ArrayExample {

    public static void main(String[] arg) {
        int[] arr = new int[]{22,11,2,33,7,9,124,0};

//        int max = arr[0];
        int max = Integer.MIN_VALUE;
        System.out.println(max);
//        int max = -999999;              -> do not recommend
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Max value: " + max);
    }

    public static void getExample7() {
        String[] a = {"22","11","2","3","7","9","124","0"};

        Integer[] b = new Integer[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = Integer.parseInt(a[i]);
        }

        System.out.println(Arrays.toString(b));
    }

    public static void getExample6() {
        /*
        Создайте массив из всех нечётных чисел от [1 до 99], выведите его на экран в строку
        в обратном порядке
         */

        int oddNumbers = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0)
                oddNumbers++;
        }

        int[] arr = new int[oddNumbers];

        int current = 99;
        for (int i = 0; i < arr.length; i++, current -= 2) { // current = current - 2
            arr[i] = current;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void getExample5() {
        int[] arr = new int[]{22,11,2,3,7,9,124,0};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Integer[] arr1 = new Integer[]{22,11,2,3,7,9,124,0};
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr1));
    }

    public static void getExample4() {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        //                    0 1 2 3 4 5 6 7
//        int[] arr_plus = Arrays.copyOf(arr, arr.length + 2);
//        arr_plus[arr_plus.length-2] = 100;
//        arr_plus[arr_plus.length-1] = 200;
//
//        int[] arr_minus = Arrays.copyOfRange(arr, 1, arr.length);
//
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr_plus));
//        System.out.println(Arrays.toString(arr_minus));

//        System.out.println(Arrays.toString(arr));

        int[] b = Arrays.copyOf(arr,50);
        System.out.println(Arrays.toString(b));

        int[] c = Arrays.copyOfRange(arr, 1,50);
        System.out.println(Arrays.toString(c));
    }

    public static void getExample3() {
        int[] a = {1,2,3,4,5};
        int[] b = a.clone();

        System.out.println("array a : " + Arrays.toString(a));
        System.out.println("array b : " + Arrays.toString(b));

        b[1] = 1000;

        System.out.println("array a : " + Arrays.toString(a));
        System.out.println("array b : " + Arrays.toString(b));
    }

    public static void getExample2() {
        Person p1 = new Person(30, "Tom", "Harley");
        Person p2 = new Person(32, "Bob", "Morley");
        Person p3 = new Person(40, "Lady", "Gaga");

        Person[] arrHR = new Person[3];
        arrHR[0] = p1;
        arrHR[1] = p2;
        arrHR[2] = p3;

//        System.out.println(Arrays.toString(arrHR));
        for (int i = 0; i < arrHR.length; i++)
            System.out.println(arrHR[i].getSurname());

//        ArrayExample ae = new ArrayExample();
//        ae.getExample1();
    }

    public static void getExample1() {
        int[] test = new int[10];  // Java way
        int test1[] = new int[10]; // C way

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 7;
        }

//        for (int i = 0; i < ; i++) {
//
//        }

        // first way
//        for (int i=0; i < arr.length; i++)
//            System.out.print(arr[i] + " ");

        // second way
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 10;
        }

        System.out.println(Arrays.toString(arr));
    }
}
