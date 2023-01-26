package chapter7;

public class VarArgs {
    static void vaTest(String msg, int... v) {
        System.out.println(msg + v.length + "Содержимое");
        for (int x : v) {
            System.out.print(x + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest("Один парамети переменной длины", 10);
        vaTest("три параметра пееменной длины", 10, 20, 30);
        vaTest("без парметров переменной длины");
    }
}
