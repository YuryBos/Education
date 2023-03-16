package MaiClass.learnCode;

public class Example1 {
    public static void main(String[] args) {

        Student student1 = new Student("Jenna", 5);
        System.out.println(student1);

//        Student student2 = new Student("John", 10);
//        System.out.println(student2);
//
//        Student student3 = new Student("Maria", 29);
//        System.out.println(student3);
//
//        Student student4 = new Student("James", 9);
//        System.out.println(student4);

//        student1 = new Student("Bob", 100);
        System.out.println(student1);
    }
}

class Student {
    private String name;
    private int number;

    private boolean morning;

    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void getResult() {
        int i = 1;
        int k = 5;
        int j = 10;

        for (int l = 0; l < j; l++) {
            k = i + k + l + 10;
        }
    }
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setMorning(boolean morning) {
        this.morning = morning;
    }

    public boolean isMorning() {
        return morning;
    }

    @Override
    public String toString() {
        return name + " " + number;
    }
}
