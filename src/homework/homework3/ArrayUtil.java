package homework.homework3;

import java.util.Arrays;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {25, 12, 55, 48, 27, 92, 32, 65, 78, 42, 33, 3};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                System.out.println(max);
            }
        }
        int min = array[0];
        for (int j = 1; j < array.length; j++) {
            if (min > array[j]) {
                min = array[j];
                System.out.println(min);
            }
        }
        int[] num = {1, 2, -2, 0, 14, 0, 56};
        for (int i = 0; i < num.length; i++) {
            int j = 0;
            if (num[i] != j)
                System.out.print(num[i] + " ");
        }
        System.out.println();//pair of elements
        int[] num2 = {12, 25, -22, 30, -2, -5, 5, 6, 8, 52};
        for (int i = 0; i < num2.length; i++) {
            if (num2[i] % 2 == 0)
                System.out.print(num2[i] + "   ");
        }
        System.out.println();
        for (int i = 0; i < num2.length; i++) {
            if (num2[i] % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < num2.length; i++) {
            if (num2[i] % 2 != 0)
                System.out.print(num2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < num2.length; i++) {
            if (num2[i] % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println();
        int result = 0;
        {
            for (int i = 0; i < num2.length; i++)
                result += num2[i];
            System.out.print(result / num2.length);
        }
        System.out.println();
        int num3[] = {45, 23, 5, 78};//sum
        {
            int elem = 0;
            for (int i = 0; i < num3.length; i++)
                elem = elem + num3[i];
            System.out.print(elem);
        }
        System.out.println();
        {
            System.out.print(num3[0]);//first
        }
        System.out.println();
        System.out.print(num3[num3.length - 1]);//last
        System.out.println();
        int[] test = {62, 25, 14, 22, 5, 67, 54, 95, 75};//Average
        {
            int aver = 0;
            for (int i = 0; i < test.length; i++)
                aver += i % test.length;
            System.out.print(test.length / 2);
        }
    }
}








