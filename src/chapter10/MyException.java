package chapter10;

public class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String tostring() {
        return "MyException[" + detail + "]";
    }
}
