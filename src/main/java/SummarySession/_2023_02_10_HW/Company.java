package SummarySession._2023_02_10_HW;

public class Company {
    private String nameOfCompany;

    public Company() {
        this.nameOfCompany = "No name";
    }
    public Company(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }
}
