package chapter14;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }

    void showType() {
        System.out.println("типом Т является" + ob.getClass().getName());
    }
}
