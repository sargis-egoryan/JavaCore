package homework.employee1;

import homework.employee1.model.Employee;
import homework.employee1.storage.EmployeeStorage;

import java.util.Scanner;

public class EmployeeDemo {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {

        boolean isRun = true;
        employeeStorage.add(new Employee("poxos", "poxosyan", "a001", 100, "company 1", "jr manager"));
        employeeStorage.add(new Employee("petros", "poxosyan", "a002", 200, "company 1", " manager"));
        employeeStorage.add(new Employee("martiros", "poxosyan", "a003", 300, "company 1", "sr manager"));
        while (isRun) {
            printCommand();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    getEmployeeById();
                    break;
                case "4":
                    System.out.println("Please input company name");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchByCompanyName(companyName);
                    break;
                case "5":
                    searchEmployeesBySalaryRange();
                    break;
                case "6":
                    changeEmployeePositionById();
                    break;
                case "7":
                    employeeStorage.printByStatus(true);
                    break;
                case "8":
                    inactivateEmployeeNyId();
                    break;
                case "9":
                    activateEmployeeNyId();
                    break;
                default:
                    System.out.println("wrong command.Please try again");
            }
        }
    }

    private static void inactivateEmployeeNyId() {
        employeeStorage.printByStatus(true);
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null) {
            employee.setActive(false);
            System.out.println("position inactivated");
        } else {
            System.out.println("employee does not exists,please try again");
        }
    }

    private static void activateEmployeeNyId() {
        employeeStorage.printByStatus(false);
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null && employee.isActive()) {
            employee.setActive(true);
            System.out.println("position activated");
        } else {
            System.out.println("employee does not exists,or employee already active please try again");
        }
    }

    private static void changeEmployeePositionById() {
        employeeStorage.print();
        System.out.println("Please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee != null) {
            System.out.println("please input new position");
            String newPosition = scanner.nextLine();
            employee.setPosition(newPosition);
            System.out.println("Position changed");
        } else {
            System.out.println("employee does not exists,please try again");
        }
    }
    private static void searchEmployeesBySalaryRange() {
        System.out.println("Please input min,max");
        String salaryRangeStr = scanner.nextLine();
        String[] salaryRange = salaryRangeStr.split(",");
        double minSalary = Double.parseDouble(salaryRange[0]);
        double maxSalary = Double.parseDouble(salaryRange[1]);
        if (minSalary > maxSalary) {
            System.out.println("min salary should be less then max salary");
        } else {
            employeeStorage.searchBySalaryRange(minSalary, maxSalary);
        }
    }

    private static void printCommand() {

        System.out.println("Please input 0 for exit");
        System.out.println("Please input 1 add employee");
        System.out.println("Please input 2 print all employee");
        System.out.println("Please input 3 search employee by ID");
        System.out.println("Please input 4 search employee by company");
        System.out.println("Please input 5 for search employees by salary range");
        System.out.println("Please input 6 for change employee position by id");
        System.out.println("Please input 7 for print only active employees");
        System.out.println("Please input 8 for inactive employee by id");
        System.out.println("Please input 9 for activate employee by id");
    }

    private static void getEmployeeById() {

        System.out.println("Please input employee Id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("Employee with" + employeeId + "does noy exits");
        } else {
            System.out.println(employee);
        }
    }

    private static void addEmployee() {
        System.out.println("please input name,surname,employeeId,salary,company,position");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");
        String employeeId = employeeData[2];
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            Employee newemployee = new Employee(employeeData[0], employeeData[1], employeeId, Double.parseDouble(employeeData[3]), employeeData[4], employeeData[5]);
            employeeStorage.add(newemployee);
            System.out.println("Employee was added");
        } else
            System.out.println("employee with" + employeeId + "already exits");

    }
}
