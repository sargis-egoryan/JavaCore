package chapter14;

public class Gen2<T, V> extends Gen1<T> {
    V ob2;

     public Gen2(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    public V getOb2() {
        return ob2;
    }
}
