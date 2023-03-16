package _2023_02_10_17;

public class StaffEmployee extends Employee{
    private int term;
    public StaffEmployee(String nameEmployee, String position, int salary, int term, Department nameDepartment) {
        super(nameEmployee, position, salary, nameDepartment);
        this.term = term;

    }
}
