package homework.employee1.storage;

import homework.employee1.model.Employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        if (employees.length == size) {
            extend();
        }
        employees[size++] = employee;
    }

    public void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, size);
        employees = tmp;
    }

    public void print() {
        for (int j = 0; j < size; j++) {
            System.out.println(employees[j]);
        }
    }

    public void printByStatus(boolean active) {
        for (int j = 0; j < size; j++) {
            if (employees[j].isActive() == active) {
                System.out.println(employees[j]);
            }
        }
    }

    public Employee getEmployeeById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(id)) {
                return employees[i];
            }
        }
        return null;
    }

    public void searchByCompanyName(String companyName) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getCompany().contains(companyName)) {
                System.out.println(employee);
            }
        }
    }

    public void searchBySalaryRange(double minSalary, double maxSalary) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() >= minSalary && employee.getSalary() <= maxSalary) {
                System.out.println(employee);
            }
        }
    }
}








