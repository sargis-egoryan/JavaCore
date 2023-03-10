package chapter14;

public class GenMethDemo {
    static <T extends Comparable<T>, V extends T>


    boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i]))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};
        if (isIn(2, nums)) {
            System.out.println("число 2 содержися в массиве nums");
        }
        if (!isIn(7, nums)) {
            System.out.println("число 7 отсуствует в массиве nums");
            System.out.println();
        }
        String str[] = {"один", "два", "три", "четыре", "пять"};
        if (isIn("два", str)) {
            System.out.println("два содержится в массиве str");
        }
        if (!isIn("семь", str)) {
            System.out.println("семь отсуствует в массиве str");
        }
    }
}
