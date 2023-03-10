package chapter2;


import chapter14.Gen2;

public class HierDemo {
    public static void main(String[] args) {
        Gen2<String, Integer> x = new Gen2<String, Integer>("значение равно:", 99);
        System.out.print(x.getob());
        System.out.println(x.getOb2());
    }
}
