package iterationsExamples;

import java.util.*;

public class IteratorExamples {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6); // List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        list.remove(iterator.next());
//        System.out.println(iterator.next());
//        iterator.remove();

        System.out.println(list);

//        Vector<Integer> vector = new Vector<>();
//        vector.add(10);
//        vector.add(20);
//        vector.add(30);
//
//        System.out.println(vector);
//
//        Enumeration<Integer> elements = vector.elements();
//        while (elements.hasMoreElements())
//            System.out.println(elements.nextElement());
//
//        Iterator<Integer> integerIterator = elements.asIterator();
    }
}
