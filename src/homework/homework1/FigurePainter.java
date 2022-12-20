package homework.homework1;

public class FigurePainter {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("* ");
            System.out.println();


        for ( i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j < 5 - (1 + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }
        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j > i; j--)
                System.out.print("* ");
            System.out.println(" ");
        }

    }
}





