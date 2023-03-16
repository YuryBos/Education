public class Person {

    private String name;
    private String surname;
    private String department;
    private String position;
    private int salary;
    private boolean inVacation;
    private String phone;
    private String mobPhone;

    public Person(String name, String surname, String department, String position, int salary, boolean inVacation, String phone, String mobPhone) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.position = position;
        this.salary = salary;
        this.inVacation = inVacation;
        this.phone = phone;
        this.mobPhone = mobPhone;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isInVacation() {
        return inVacation;
    }

    public void setInVacation(boolean inVacation) {
        this.inVacation = inVacation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobPhone() {
        return mobPhone;
    }

    public void setMobPhone(String mobPhone) {
        this.mobPhone = mobPhone;
    }
}
