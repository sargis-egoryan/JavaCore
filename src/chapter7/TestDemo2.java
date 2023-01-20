package chapter7;

public class TestDemo2 {
    public static void main(String[] args) {
        Test2 ob = new Test2(15, 20);
        System.out.println(ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println(ob.a + " " + ob.b);
    }
}
