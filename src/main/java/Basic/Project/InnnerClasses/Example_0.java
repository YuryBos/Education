package InnnerClasses;

/*
    Вложенный внутренний класс
*/

public class Example_0 {

    private String name;

    class Inner {
        public void printIt() {
            name = "Roman";
            System.out.println("This is a method of nested class");
        }
    }

    public static void main(String[] args) {


        Example_0.Inner example0Variable = new Example_0().new Inner();
//        var example0Variable1 = new Example_0().new Inner();
        example0Variable.printIt();
    }
}
