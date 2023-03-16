public class PolymorhismExamples {
    public static void main(String[] args) {
//        CalculatorParent calculatorParent = new CalculatorParent();
//
////        System.out.println(calculatorParent.sum(1.5,2));
////        System.out.println(calculatorParent.sum(3.14,2.71));
////        System.out.println(calculatorParent.sum(2));
//
//        Person person = new Person();
//        person.setAllVariabels("Bob", "Morley");

//        CalculatorParent calculatorParent = new CalculatorParent();
//        System.out.println(calculatorParent.sum(10,20));
//
//        CalculatorChild calculatorChild = new CalculatorChild();
//        System.out.println(calculatorChild.sum(10,20));
//
//        CalculatorParent calculatorParent2 = new CalculatorParent();
//        System.out.println(calculatorParent2.sum(10,20));

        CalculatorChild calculatorChild1 = new CalculatorChild();
        System.out.println(calculatorChild1.sum(10,20));

        CalculatorParent calculatorChild2 = new CalculatorChild();
        System.out.println(calculatorChild2.sum(10,20));
    }
}

class CalculatorChild extends CalculatorParent {
    @Override
    int sum(int a, int b) {
        return a + b + 10;
    }
}

class CalculatorParent {
    int sum(int a, int b) {
        return a + b;
    }
    double sum(double a, double b) {
        return a + b;
    }
    double sum(int a) {
        return a + 5.14;
    }
}

class Person {
    private String name, surname;

    void setAllVariabels(String name, String surname) {
        this.name = name;
        this.surname = surname;

        System.out.println("name: " + name + ", surname: " + surname);
    }

    // not realizable
//    void setAllVariabels(String surname, String name) {
//
//    }
}