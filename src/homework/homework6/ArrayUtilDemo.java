package homework.homework6;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 88, 22, 11, 66, 12, 30, 6, 4, 3};
        ArrayUtil au = new ArrayUtil();
        au.maxOfArray(array);
        ArrayUtil au1 = new ArrayUtil();
        au1.minOfArray(array);
        ArrayUtil au2 = new ArrayUtil();
        au2.pairOfElements(array);
        ArrayUtil au3 = new ArrayUtil();
        au3.uneven(array);
        ArrayUtil au4 = new ArrayUtil();
        au4.sum(array);
        ArrayUtil au5 = new ArrayUtil();
        au5.firstOfArray(array);
        ArrayUtil au6 = new ArrayUtil();
        au6.lastOfArray(array);
        ArrayUtil au7 = new ArrayUtil();
        au7.averageOfArray(array);
    }
}
