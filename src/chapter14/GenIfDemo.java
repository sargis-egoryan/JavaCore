package chapter14;

public class GenIfDemo {
    public static void main(String[] args) {
        Integer inums[] = {3, 6, 2, 8, 6};
        Character chs[] = {'b', 'r', 'p', 'w'};
        MyClass<Integer> iob = new MyClass<Integer>(inums);
        MyClass<Character> cob = new MyClass<Character>(chs);
        System.out.println("inums" + iob.max());
        System.out.println("inums" + iob.min());
        System.out.println("chs" + cob.max());
        System.out.println("chs" + cob.min());
    }
}
