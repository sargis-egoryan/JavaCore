package homework.homework8;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size == 9) {
            System.out.println("заполнен");
        } else {
            array[++size] = value;
        }
    }
    int result[]=new int[15];
    int index=0;
}
