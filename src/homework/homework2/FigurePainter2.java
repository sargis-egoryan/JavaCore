package homework.homework2;

public class FigurePainter2 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("* ");

            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 5; i >= 2; i--) {
            for (int s = 6; s >= i; s--) {
                System.out.print(" ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();

        }

    }

}





