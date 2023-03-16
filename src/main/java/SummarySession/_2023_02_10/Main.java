package SummarySession._2023_02_10;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box(12, 12, 12);

System.out.println("b1: " + b1);
        b1.setHeight(44.0);
        System.out.println("b1: " + b1);

        Box b2 = new Box(8, 9, 5);
        System.out.println("b2: " + b2);
        b2.setWith(50.0);
        System.out.println("b2: " + b2);

        Box b3 = b1;
        System.out.println("b3: " + b3);

        C c = new C();

        A a = new C();
        B b = new C();
    }
}
