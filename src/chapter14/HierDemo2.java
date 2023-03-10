package chapter14;

public class HierDemo2 {
    public static void main(String[] args) {
        Gen3<String> x = new Gen3<String>("добро пожаловать", 47);
        System.out.print(x.getNum());
        System.out.println(x.getob());
    }
}
