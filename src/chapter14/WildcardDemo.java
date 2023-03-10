package chapter14;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("среднее значение iob равно" + v);
        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("среднее значение dob равно" + w);
        Float fnums[] = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        Stats<Float> fob = new Stats<Float>(fnums);
        double x = fob.average();
        System.out.println("среднее значение x равно" + x);
        if (iob.sameAvg(dob)) {
            System.out.println("равно");
        } else System.out.println("отличаются");
        if (iob.sameAvg(fob)) {
            System.out.println("равно");
        } else System.out.println("отличаются");
    }
}
