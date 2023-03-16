import java.util.Arrays;
import java.util.Random;

public class BreakContinueOperators {
    public static void main(String[] args) {
        // random initialization
//        int[] a = new int[10]; //
//        for (int i = 0; i < a.length; i++) {
//            Random r = new Random();
//            a[i] = r.nextInt(7, 10);
//        }

        // 0. increment / decrement
//        int w = 10;
        // increment
        // print; w = w + 1 -> w++
        // w = w + 1; print -> ++w
//        System.out.println(w++);
//        System.out.println(w);

        // decrement
        // print; w = w - 1 -> w--
        // w = w - 1; print -> --w
//        System.out.println(w--);
//        System.out.println(w);


        
//         1. break
//        int[] a = {11, 8, 74, 5, 10, 9, 2};
//        System.out.println(Arrays.toString(a));
//
//        // i++ <==> i = i + 1
//        for (int i = 0; i < a.length; i++) {
//
//            if (a[i] == 74)
//                break;
//            else
//                System.out.println(a[i]);
//        }

        // 2. continue
//        int[] a = {11, 8, 74, 5, 10, 9, 2};
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i]);
//            if (a[i] % 2 == 0) {
//                System.out.println();
//                continue;
//            }
//
//            System.out.println(" Не делится без остатка");
//        }

        // 3. return
        int[] a = {11, 8, 74, 5, 10, 9, 2};
        System.out.println(Arrays.toString(a));

        // i++ <==> i = i + 1
        for (int i = 0; i < a.length; i++) {

            if (a[i] == 74)
                return;
            else
                System.out.println(a[i]);
        }

        System.out.println("Final string");

    }
}
