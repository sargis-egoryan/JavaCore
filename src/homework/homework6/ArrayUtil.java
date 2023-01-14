package homework.homework6;

public class ArrayUtil {
    void maxOfArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.print(max);
        System.out.println();
    }

    void minOfArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.print(min);
        System.out.println();
    }

    void pairOfElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + "   ");

            }
        }
        System.out.println();
    }

    void uneven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    void sum(int[] array) {
        int elem = 0;
        for (int i = 0; i < array.length; i++) {
            elem = elem + array[i];
        }
        System.out.print(elem);
        System.out.println();
    }

    void firstOfArray(int[] array) {
        System.out.print(array[0]);
        System.out.println();
    }

    void lastOfArray(int[] array) {
        System.out.print(array[array.length - 1]);
        System.out.println();
    }

    void averageOfArray(int[] array) {
        int aver = 0;
        for (int i = 0; i < array.length; i++)
            aver += array[i];
        System.out.print(aver / array.length);
        System.out.println();
        }

        void num(int[]array){
            for (int i = 0; i < array.length; i++) {

            } System.out.print(array.length);
        }
    }
