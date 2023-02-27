package chapter12;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap = Apple.RedDel;
        System.out.println("значение ap:" + ap);
        System.out.println();

        ap = Apple.GoldenDel;
        if (ap == Apple.GoldenDel) {
            System.out.println("переменная ap содержит GoldenDel.\n ");
            switch (ap) {
                case Jonathan:
                    System.out.println("jonathan красный");
                    break;
                case GoldenDel:
                    System.out.println("GoldenDel желтый");
                    break;
                case RedDel:
                    System.out.println("RedDel красный");
                    break;
                case Winesap:
                    System.out.println("Winesap красный");
                    break;
                case Cortland:
                    System.out.println("Cortland красный");
                    break;
            }
        }
    }
}

