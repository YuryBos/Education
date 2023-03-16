package MaiClass.learnCode;

import java.util.Arrays;

public class EnumExamples {
    public static void main(String[] args) {

//        for (int i = 0; i < DaysOfWeeks.values().length; i++) {
//            System.out.println(
//                            DaysOfWeeks.values()[i]
//                            + " " +
//                            DaysOfWeeks.values()[i].getPrice()
//            );
//        }

//        for (DaysOfWeeks d : DaysOfWeeks.values()) {
//            System.out.println(
//                    d + " " + d.getPrice() + " " + d.printMenu()
//            );
//        }

        String a = "hello";
        String b = "hello";

        System.out.println(a.equals(b));
        System.out.println(a == b);

        System.out.println();

        String c = new String("java");
        String d = new String("java");

        System.out.println(c.equals(d));
        System.out.println(c == d);

        c = null;
    }
}

enum DaysOfWeeks {
    MO(10) {
        @Override
        String printMenu() {
            return "brokkoli";
        }
    },
    TU (11) {
        @Override
        String printMenu() {
            return "pizza margarita";
        }
    },
    WE(12) {
        @Override
        String printMenu() {
            return "pizza carbonara";
        }
    },
    TH(13) {
        @Override
        String printMenu() {
            return "fish";
        }
    },
    FR(14) {
        @Override
        String printMenu() {
            return "meat";
        }
    },
    SA(15) {
        @Override
        String printMenu() {
            return "sishi";
        }
    },
    SU(16) {
        @Override
        String printMenu() {
            return "vegetables";
        }
    };

    private int price;

    DaysOfWeeks(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    abstract String printMenu();
}

interface TTTTT {
    void print();
}

interface AAAAA {
    void printResult();
}