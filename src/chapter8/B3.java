package chapter8;

public class B3 extends A3 {
    int k;

    B3(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}
