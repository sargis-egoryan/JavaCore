package homework.homework8;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[++size] = value;
    }

    private void extend() {
        int[] result = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        array = result;
    }

    public int getByIndex(int index) {
        return index < 0 || index > size ? -1 : array[index];
    }

    public void print() {
        for (int j : array) {
            System.out.println(j);
        }
    }
}

