package SummarySession._2023_02_10_HW;

public class Employee {
    private String nameEmployee;
    private String position;
    private int salary;
    private Department nameDepartment;

    public Employee(String nameEmployee, String position, int salary, Department nameDepartment) {
        this.nameEmployee = nameEmployee;
        this.position = position;
        this.salary = salary;
        this.nameDepartment = nameDepartment;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
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

    public Department getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(Department nameDepartment) {
        this.nameDepartment = nameDepartment;
    }
}
