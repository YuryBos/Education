package SummarySession._2023_02_10_HW;

public class StaffEmployee extends Employee{
    private int term;
    public StaffEmployee(String nameEmployee, String position, int salary, int term, Department nameDepartment) {
        super(nameEmployee, position, salary, nameDepartment);
        this.term = term;

    }
}
