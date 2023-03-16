package Extended;

public class ITSpecialist extends Person {

    private String department, position;

    public ITSpecialist(
            int age,
            String name,
            String surname,
            String department,
            String position) {

        super(age, name, surname);

        this.department = department;
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDept. is " +
                department + "\nposition is " + position;
    }
}

// Object   <- Person <- ITSpecialist
//                       age
//                       name
//                       surname
// toString    age       dptm
//             name      position
//             surname   @toString
//             @toString