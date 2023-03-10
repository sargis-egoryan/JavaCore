package chapter14;

public class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println("объект ob относится к типу" + ob.getClass().getName());
    }
}
