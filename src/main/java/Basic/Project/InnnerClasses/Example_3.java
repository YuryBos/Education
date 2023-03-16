package InnnerClasses;

/*
    Анонимные внутренние классы (через интерфейс)
 */

public class Example_3 {
    Parentable p = new Parentable() {
        @Override
        public void show() {
            System.out.println("Method of parent interface");
        }

        @Override
        public void printIt() {
            System.out.println("welcome");
        }
    };

    public static void main(String[] args) {
        Example_3 e3 = new Example_3();
        e3.p.show();
    }
}

interface Parentable {
    void show();
    void printIt();
}
