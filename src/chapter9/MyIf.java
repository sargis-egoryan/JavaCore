package chapter9;

public interface MyIf {
    int getNumber();

    default String getString() {
        return "объект типа String по умолчанию";
    }
}
