package homework.homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'l', 'o', 'v', 'e', 'o'};
        char c = 'o';
        int sum = 0;
        for (char x : chars) {
            if (x == 'o') {
                sum++;
            }
        }
        System.out.println(sum);
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        int i = 0;
        i += chars2.length;
        System.out.print(chars2[i / 2 - 1] + "" + chars2[i / 2]);
        System.out.println();
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        if (chars3[i - 1] == 'y' && chars3[i - 2] == 'l') {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
        System.out.println();
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (char ch : text) {
            if (ch != ' ') {
                System.out.print(ch);
            }
        }
    }
}







