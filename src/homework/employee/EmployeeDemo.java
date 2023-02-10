package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 add employee");
            System.out.println("Please input 2 print all employee");
            System.out.println("Please input 3 search employee by employee ID");
            System.out.println("Please input 4 search employee by company name");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input name");
                    String name = scanner.nextLine();
                    System.out.println("Please input surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input emplyeeID");
                    String emplyeeID = scanner.nextLine();
                    System.out.println("Please input salary");
                    double salary = scanner.nextDouble();
                    System.out.println("Please input company");
                    double company = scanner.nextDouble();
                    System.out.println("Please input position");
                    double position = scanner.nextDouble();
                    Employee employee = new Employee(name, surname, emplyeeID, salary, company, position);
                    employeeStorage.add(employee);
                    System.out.println("employee was added");
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input employee ID");
                    String ID = scanner.nextLine();
                    employeeStorage.searchByname(ID);
                    break;
                case "4":
                    System.out.println("Please input company name");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchByname(companyName);
                    break;
                default:
                    System.out.println("wrong command.Please try again");
            }
        }
    }
}
