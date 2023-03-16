public class BoxUnbox {
    public static void main(String[] args) {
        // int <-> Integer
        int a = 4;
        Integer b = a;
        System.out.println(a + " " + b);

        // double <-> Double
        Double d = Double.valueOf(5.5);
        double f = d;
        System.out.println(d + " " + f);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE - 1);

        Integer r = Integer.valueOf(10);
        System.out.println(r);


    }
}
