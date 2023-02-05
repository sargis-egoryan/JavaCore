package chapter8;

public class Dispatch {
    public static void main(String[] args) {
        A4 a = new A4();
        B4 b = new B4();
        C4 c = new C4();
        A4 r;
        r = a;
        r.callme();
        r = b;
        r.callme();
        r = c;
        r.callme();

    }
}
