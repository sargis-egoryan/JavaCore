package chapter9;

public class NestedIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        if (nif.isNotNegative(10)) {
            System.out.println("число 10 не отрицательное");
            if (nif.isNotNegative(-12)) {
                System.out.println("это не будед выведено");
            }
        }
    }
}
