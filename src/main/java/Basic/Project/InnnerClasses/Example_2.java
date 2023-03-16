package InnnerClasses;

/*
    Анонимные внутренние классы (через класс)
 */

public class Example_2 {
    Parent p = new Parent() {  // Parent p = new Parent() { -> class <Anonymous> extends Parent {
        @Override
        public void show() {
            super.show();
            System.out.println("all ok");
        }
    };

    public static void main(String[] args) {
        Example_2 e2 = new Example_2();
        e2.p.show();
    }
}

class Parent {
    public void show() {
        System.out.println("method of Parent class");
    }
}
