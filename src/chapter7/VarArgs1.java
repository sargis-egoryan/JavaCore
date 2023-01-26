package chapter7;

public class VarArgs1 {
    static void vaTest(int... v) {
        System.out.println(v.length);
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.println(msg + v.length);
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.println(v.length);
        for (boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10, 20, 30, 40);
        vaTest(true, false, true);
        vaTest("Проверка", 70);
    }
}
