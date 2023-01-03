package homework.homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'l', 'o', 'v', 'e', 'o'};
        char c = 'o';
        int sum = 0;
        for (char x : chars) {
            if (x == 'o')
                sum++;
        }
        System.out.println(sum);
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.print(chars2.length / 2 - 1 + " " + chars2.length / 2);
        System.out.println();
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        {
            if (chars3[7] == 'y' && chars3[6] == 'l')
                System.out.print("true");
            else
                System.out.print("false");
        }
        System.out.println();
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (char x : text)
            if (x != ' ')
                System.out.print(x);
    }
}



