package chapter8;

public class Rectangle1 extends Figure1 {
    Rectangle1(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("В области четирехугольника");
        return dim1 * dim2;
    }
}
