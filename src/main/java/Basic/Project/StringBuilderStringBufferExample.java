package Basic.Project;

import java.util.Arrays;

public class StringBuilderStringBufferExample {
    public static void main(String[] args) {
        StringBuffer sbuffer = new StringBuffer("Basic 45-46m \n");
        sbuffer.append("hello world!").append(" It's me");

        System.out.println(sbuffer);
    }

    public static void getExampleStringBuilder() {
        // oldCapacity * 2 + 2
        StringBuilder sb = new StringBuilder();

        sb.append("hello java!");
        sb.appendCodePoint(128526);
        sb.replace(3,5,"Thu 13 Dec 2022");

        sb.reverse();

        System.out.println(sb);
        System.out.println("Length = " + sb.length());
        System.out.println("Capacity = " + sb.capacity());
    }

    public static void getExampleString() {
        String a = "hello";
        String b = "hello"; //  = a

//        System.out.println(a == b);
//        System.out.println(a.equals(b));
//        System.out.println(b.equals(a));

//        System.out.println(" - - - ");

        String c = new String("hello");
        String d = new String("hello");

//        System.out.println(c == d);
//        System.out.println(c.equals(d));
//        System.out.println(d.equals(c));

        a = a.toUpperCase();
        a = a.toUpperCase() + a.toLowerCase();
        System.out.println(a);
    }
}
