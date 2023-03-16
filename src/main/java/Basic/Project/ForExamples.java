package Basic.Project;

public class ForExamples {
    public static void main(String[] args) {

//        for (int i = 5, y = 15; y < 30 ; i++, y++) {
//            if (i < 10)
//                System.out.println(i + " " + y);
//            else
//                System.out.println(y);
//        }

//        byte w = 125;
//        System.out.println(w);
//        w = (byte)(w + 1);
//
//        System.out.println(w);
//
//        w = (byte)(w + 1);
//        System.out.println(w);
//
//        w = (byte)(w + 1);
//        System.out.println(w);

//        System.out.println(Byte.MAX_VALUE);

//        for (byte i = 125; i > -125; i++) {
//            System.out.println(i);
//        }

//        double i;
//
//        for (i = 0; i < 1; i = i + 0.1) {
//            System.out.println(i);
//        }
//
//        System.out.println("Result:" + i);

//        long start = System.nanoTime();

        // четность наших значений (выводили только четные)
        // 251500 - classic way
        // 840000 - continue

        // четность наших индексов
        // 502833 - classic way
        // 213917 - shift jumping

        int[] arr = {12,74,2,34,90,74,123,11,9,22,44,66};
        float[] arr_2 = {1f, 2f, 4f};

//        for (int i = 0; i < arr.length; i = i + 2) {
//            System.out.println(arr[i]);
//        }

//        long finish = System.nanoTime();
//
//        System.out.println("Time process: " + (finish - start));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
////
//        for (float element: arr_2) {
//            System.out.println(element);
//        }

    }
}
