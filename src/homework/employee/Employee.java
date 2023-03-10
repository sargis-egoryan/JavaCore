package homework.employee;

import java.util.Objects;

public class Employee {

    private String name;
    private String surname;
    private String emplyeeID;
    private double salary;
    private double company;
    private double position;

    public Employee(String empoyeeDatum, String datum, String employeeId, double v) {

    }

    public Employee(String name, String surname, String emplyeeID, double salary, double company, double position) {
        this.name = name;
        this.surname = surname;
        this.emplyeeID = emplyeeID;
        this.salary = salary;
        this.company = company;
        this.position = position;
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

    public String getEmplyeeID() {
        return emplyeeID;
    }

    public void setEmplyeeID(String emplyeeID) {
        this.emplyeeID = emplyeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getCompany() {
        return company;
    }

    public void setCompany(double company) {
        this.company = company;
    }

    public double getPosition() {
        return position;
    }

    public void setPosition(double position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Double.compare(employee.company, company) == 0 && Double.compare(employee.position, position) == 0 && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(emplyeeID, employee.emplyeeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, emplyeeID, salary, company, position);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", emplyeeID=" + emplyeeID +
                ", salary=" + salary +
                ", company=" + company +
                ", position=" + position +
                '}';
    }

}
