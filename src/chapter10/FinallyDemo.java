package chapter10;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("в теле метода procA");
            throw new RuntimeException("демонстрация");
        } finally {
            System.out.println("блок оператора finally в методе procA");
        }
    }

    static void procaB() {
        try {
            System.out.println("в теле метода procaB");
            return;
        } finally {
            System.out.println("блок оператора finally в методе procaB");
        }
    }

    static void procaC() {
        try {
            System.out.println("в теле метода procaC");
        } finally {
            System.out.println("блок оператора finally в методе procaC");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("исключение перехвачено");
        }
        procaB();
        procaC();
    }
}
