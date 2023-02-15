package homework.employee;

public class EmployeeStorage {
    private Employee[] array = new Employee[10];
    private int size = 0;
    public void add(Employee value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }
    public void extend() {
        Employee[] result = new Employee[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        array = result;
    }
    public void print() {
        for (int j = 0; j < size; j++) {
            System.out.println(array[j]);
        }
    }
    public void searchByname(String ID) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getName().contains(ID)) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("employee1 " + ID + " not found");
        }
    }
}





