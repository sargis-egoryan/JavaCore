package chapter7;

public class TestDemo3 {
    public static void main(String[] args) {
        Test3 ob1 = new Test3(2);
        Test3 ob2;
        ob2 = ob1.incrByTen();
        System.out.println(ob1.a);
        System.out.println(ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println(ob2.a);
    }
}
