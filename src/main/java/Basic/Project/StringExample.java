package Basic.Project;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
//        String a = "hello";
//        String b = "hello";
//
//        System.out.println(a == b);
//        System.out.println(a.equals(b));
//        System.out.println(b.equals(a));
//
//        String c = new String("hello");
//        String d = new String("hello");
//
//        System.out.println(c == d);
//        System.out.println(c.equals(d));
//        System.out.println(d.equals(c));

//        int[] arrA = {10, 20, 30, 40};
//        int[] arrB = arrA.clone();
//
//        System.out.println("arrA: " + Arrays.toString(arrA));
//        System.out.println("arrB: " + Arrays.toString(arrB));
//
//        arrB[0] = 1000;
//
//        System.out.println("arrA: " + Arrays.toString(arrA));
//        System.out.println("arrB: " + Arrays.toString(arrB));

        // H E L L O -> 5 symbols
        // 0 1 2 3 4

        String w = "Hello world, it's me the Java";

        System.out.println("Length: " + w.length());
        System.out.println("10th element: " + w.charAt(10));
        System.out.println("Last element: " + w.charAt(w.length() - 1));

        System.out.println("First substring: " + w.substring(5));
        System.out.println("Second substring: " + w.substring(5, 10));

        // [0;3] -> 0,1,2,3
        // (0;3) -> 1,2
        // [0;3) -> 0,1,2
        // (0;3] -> 1,2,3

        System.out.println(w.toLowerCase());
        System.out.println(w.toUpperCase());

        char[] chars = w.toCharArray();
        System.out.println(chars[4]);
        System.out.println(chars[9]);
        System.out.println(chars[19]);
    }
}
