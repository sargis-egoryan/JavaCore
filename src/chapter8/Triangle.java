package chapter8;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("в области треугольника");
        return dim1 * dim2 / 2;
    }
}
