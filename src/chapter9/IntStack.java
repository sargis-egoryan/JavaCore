package chapter9;

public interface IntStack {
    void push(int item);

    int pop();

    default int[] popNElements(int n) {
        return getNElements(n);
    }

    int[] getNElements(int n);


    default int[] skipAndePopElements(int skip, int n) {
        getElements(skip);
        return getElements(n);
    }

    private int[] getElements(int n) {
        int[] elements = new int[n];
        return elements;
    }
}
