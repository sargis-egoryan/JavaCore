package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int first = 0;
        int lastindex = spaceArray.length - 1;
        while (first < spaceArray.length && spaceArray[first] == ' ') {
            first++;
        }
        while (first < spaceArray.length && spaceArray[lastindex] == ' ') {
            lastindex--;
        }
        char[] result = new char[(lastindex - first) + 1];
        int index = 0;
        for (int i = first; i < lastindex + 1; i++) {
            result[index++] = spaceArray[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}
