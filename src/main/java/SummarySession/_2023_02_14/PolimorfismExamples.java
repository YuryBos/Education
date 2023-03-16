package SummarySession._2023_02_14;

public class PolimorfismExamples {
    public static void main(String[] args) {

//        CalculatorParent calculator = new CalculatorParent();
//        System.out.println(calculator.sum(10, 20));
//        System.out.println(calculator.sum(3.14, 2.17));
//        System.out.println(calculator.sum(3.14));

//        Person person = new Person();
//        person.setAllvariables("John", "Doe");

//        CalculatorParent calculator = new CalculatorParent();
//        System.out.println(calculator.sum(10, 20));
//
//        CalculatorChaild calculatorChaild = new CalculatorChaild();
//        System.out.println(calculatorChaild.sum(10, 20));

        CalculatorChaild calculatorChaild1 = new CalculatorChaild();
        System.out.println(calculatorChaild1.sum(10, 20));
        CalculatorChaild calculatorChaild2 = new CalculatorChaild();
        System.out.println(calculatorChaild2.sum(10, 20));

    }
}

class CalculatorChaild extends CalculatorParent {
    int sum(int a, int b) {
        return a + b + 100;
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
        return a + 5;
    }

}

class Person {

    private String name, surname;
    void setAllVariables(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    // not working
//    void setAllVariables(String surname, String name) {
//        this.name = name;
    }

