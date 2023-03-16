package MaiClass.learnCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExamples {
    public static void main(String[] args) {
//        // java way
//        int[] a = new int[5];
//
//        // c++ way
//        int b[] = new int[5];
//
//        int[] c = {1,2,3};
//        int[] d = new int[]{1,2,3};
//
//        Book[] books = new Book[5];
//        boolean[] booleans = new boolean[2];
//
//        System.out.println(a);
//        System.out.println(a.getClass());
//
//        System.out.println(booleans);
//        System.out.println(booleans.getClass());
//
//        System.out.println(new String[]{"123", "123"});
//        System.out.println(new String[]{"123", "123"}.getClass());
//
//        System.out.println(books);
//        System.out.println(books.getClass().getSuperclass());

//        int width = 2;
//        int height = 3;
//
//        int[][][] picture = {
//                {{1,2,3}, {4,5,6}},
//                {{10,20,30},{40,50,60}}
//        };
        // picture = {{{1,2,3}, {4,5,6}},{{10,20,30},{40,50,60}}}
        // picture[0] = {{1,2,3}, {4,5,6}}
        // picture[0][0] = {1,2,3}
        // picture[0][0][0] = 1

//        System.out.println("original: " + Arrays.toString(picture[0][1]));
//
//        int[][][] picture2 = picture.clone();
//
//        picture2[0] = picture[0].clone();
//        picture2[1] = picture[1].clone();
//
//        picture2[0][0] = picture[0][0].clone();
//        picture2[0][1] = picture[0][1].clone();
//        picture2[1][0] = picture[1][0].clone();
//        picture2[1][1] = picture[1][1].clone();
//
//        System.out.println("original: " + Arrays.toString(picture[0][1]));
//        System.out.println("copy: " + Arrays.toString(picture2[0][1]));
//
//        picture2[0][1][1] = 1000;
//        System.out.println("original: " + Arrays.toString(picture[0][1]));
//        System.out.println("copy: " + Arrays.toString(picture2[0][1]));

        int[][] a = new int[4][2];
        a[0] = new int[]{1,2};
        a[1] = new int[]{3,4, 10, 20};
        a[2] = new int[]{5,6};
        a[3] = new int[]{7,8};

        System.out.println(a.length);

        for (int [] b : a) {
            for (int p : b) {
                System.out.print(p + " ");
            }
            System.out.println();
        }

//        for (int i = 0; i < a.length; i++) {
//            for (int p : a[i])
//                System.out.print(a[i] + " ");
//            System.out.println();
//        }

    }
}
