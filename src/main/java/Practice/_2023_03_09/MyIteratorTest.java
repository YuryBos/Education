package Practice._2023_03_09;

import java.util.ArrayList;
import java.util.List;

public class MyIteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

        }


        System.out.println(new MyIterator().hasNext(list));
        System.out.println(new MyIterator().next(list));



    }
}