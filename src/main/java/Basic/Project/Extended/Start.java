package Extended;

public class Start {
    public static void main(String[] args) {
        Person person = new Person(
                36,
                "Bob",
                "Morley"
        );
        System.out.println(person.toString());


        ITSpecialist specialist1 = new ITSpecialist(
                40,
                "Justin",
                "Timberlake",
                "compliance dpmt",
                "Java backend engineer"
        );

        System.out.println(specialist1.toString());
    }
}
