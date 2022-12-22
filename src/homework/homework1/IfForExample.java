package homework.homework1;

public class IfForExample {
    public static void main(String[] args) {

        int a, b;
        a = 20;
        b = 40;
        if (a >= b) System.out.println(a);
        else
            System.out.println(b);

        int c, d;
        c = 60;
        d = 50;

        if (c > d)
            for (int i = d; i <= c; i++) {
                System.out.print(i + " ");
            }
        else {
            for (int i = c; i <= d; i++) {
                System.out.print(i + " ");
            }
        }


        int o = 65;
        char ch1 = (char) o;
        System.out.println(ch1);
        int k = 40;
        char ch2 = (char) k;
        System.out.println(ch2);


        int i, j;
        i = 20;
        j = 40;
        if (a == b) System.out.println("i=j");
        else
            System.out.println("i-ն հավասար չէ j-ին");

    }
}










