package homework;

import java.util.Arrays;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {25, 12, 55, 48, 27, 92, 32, 65, 78, 42, 33, 3};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                System.out.println(max);
            }
        }


        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (min > array[j]) {
                min = array[j];
                System.out.println(min);
            }

        }


    }
}



