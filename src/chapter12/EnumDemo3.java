package chapter12;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("яблоко сорта Winesap стоит" + Apple.Winesap.getPrice() + "центов\n");
        System.out.println("цены на все сортов яблок");
        for (Apple a : Apple.values()) {
            System.out.println(a + "стоит" + a.getPrice() + "центов");
        }
    }
}
