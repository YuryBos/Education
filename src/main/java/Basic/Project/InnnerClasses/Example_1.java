package Basic.Project.InnnerClasses;

/*
    Локальный внутрений метод класса
 */

public class Example_1 {

    public void additionMethod() {
        System.out.println("label: inside additionalMethod");

        class Inner {
            public void innerMethod() {
                System.out.println("label: inside additionalMethod and inside Inner class");
            }
        }

        Inner innerClass = new Inner();
        innerClass.innerMethod();
    }

    public static void main(String[] args) {
        Example_1 example1 = new Example_1();
        example1.additionMethod();
    }
}
