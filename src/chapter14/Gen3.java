package chapter14;

public class Gen3<T> extends NonGen1 {
    T ob;

    Gen3(T o, int i) {
        super(i);
        ob = o;
    }

    T getob() {
        return ob;
    }
}
