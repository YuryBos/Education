public class Car {

    private String model;
    private int age;

    public Car() {
        model = "mercedes";
        age = 1960;
        printModelAndYear();
    }

    public Car(String model) {
        this.model = model;
        age = 1970;
        printModelAndYear();
    }

    public Car(int age) {
        model = "bmw";
        this.age = age;
        printModelAndYear();
    }

    public Car(int age, String model) {
        this.model = model;
        this.age = age;
        printModelAndYear();
    }

    public Car(String model, int age) {
        this(model);
        this.age = age;
        printModelAndYear();
//        printModelAndYear();
    }

    public void printYear() {
        String temp = "This auto was produced in ";
        System.out.println(temp + age);
    }

    public void printModel() {
        String temp = "This mode is ";
        System.out.println(temp + model);
    }

    public void printModelAndYear() {
        System.out.println("Model: " + model + ", year: " + age);
    }
}
