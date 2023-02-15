package chapter9;

public class AskMe implements SharedConstants {
    static void answer(int result) {
        switch (result) {
            case NO:
                System.out.println("нет");
                break;
            case YES:
                System.out.println("да");
                break;
            case MAYBE:
                System.out.println("возможно");
                break;
            case LATER:
                System.out.println("позднее");
                break;
            case SOON:
                System.out.println("вскоре");
                break;
            case NEVER:
                System.out.println("никогда");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
