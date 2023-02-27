package chapter12;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("константы перечислимого типа Apple");
        Apple allapples[] = Apple.values();
        for (Apple a : allapples) {
            System.out.println(a);
            System.out.println();
        }
        ap = Apple.valueOf("Winesap");
        System.out.println("переменная ap содержит" + ap);

    }
}
