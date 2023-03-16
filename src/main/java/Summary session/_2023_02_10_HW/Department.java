package _2023_02_10_17;

public class Department {
    private String nameDepartment;
    private int numberOfEmployees;
    private Company nameOfCompany;

    public Department(String nameDepartment, int numberOfEmployees, Company nameOfCompany) {
        this.nameDepartment = nameDepartment;
        this.numberOfEmployees = numberOfEmployees;
        this.nameOfCompany = nameOfCompany;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Company getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(Company nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }
}
