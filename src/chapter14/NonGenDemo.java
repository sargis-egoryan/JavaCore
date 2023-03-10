package chapter14;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iob;
        iob = new NonGen(88);
        iob.showType();
        int v = (Integer) iob.getOb();
        System.out.println("значение" + v);
        System.out.println();
        NonGen strOb = new NonGen("тест без обощений");
        String str = (String) strOb.getOb();
        System.out.println("значение" + str);
    }
}
