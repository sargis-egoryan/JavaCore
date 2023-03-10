package chapter12;

public class AutoBox3 {
    public static void main(String[] args) {
        Integer iob, iob2;
        int i;
        iob = 100;
        System.out.println("исходное значение iob" + iob);
        ++iob;
        iob2 = iob + (iob / 3);
        System.out.println("iob2 после выражения" + iob2);
        i = iob + (iob / 3);
        System.out.println("iob после выражения" + iob2);
    }
}
