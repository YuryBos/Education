package Extended;

public class Person {

    private int age;
    private String name, surname;

    public Person(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Our person is " + name + " " +
                surname + " " +
                age + " y.o.";
    }
}
