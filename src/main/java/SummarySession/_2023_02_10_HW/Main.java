package SummarySession._2023_02_10_HW;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Apple");
        Department department = new Department("IT", 10, company);
        Employee employee = new Employee("John", "Manager", 1000, department);
        company.setNameOfCompany("Google");
        Department department1 = new Department("Develop", 20, new Company("Microsoft"));

        System.out.println(employee.getNameEmployee());
        System.out.println(employee.getPosition());
        System.out.println(employee.getSalary());
        System.out.println(employee.getNameDepartment().getNameDepartment());
        System.out.println(employee.getNameDepartment().getNumberOfEmployees());
        System.out.println(employee.getNameDepartment().getNameOfCompany().getNameOfCompany());
    }
}
