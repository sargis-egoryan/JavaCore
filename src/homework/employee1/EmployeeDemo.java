package homework.employee1;

import java.util.Scanner;

public class EmployeeDemo {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {

        boolean isRun = true;
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
                default:
                    System.out.println("wrong command.Please try again");
            }
        }
    }

    private static void printCommand() {

        System.out.println("Please input 0 for exit");
        System.out.println("Please input 1 add employee");
        System.out.println("Please input 2 print all employee");
        System.out.println("Please input 3 search employee by ID");
        System.out.println("Please input 4 search employee by company");
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
