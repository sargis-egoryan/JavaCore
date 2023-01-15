package homework.homework7;

public class Calculator {
    double plus(double num, double num2) {

        return num + num2;
    }

    double minus(double num, double num2) {

        return num - num2;
    }

    double divide(double num, double num2) {
        if (num2 == 0) {
            return -1;
        } else {
            return num / num2;
        }
    }

    double multiply(double num, double num2) {

        return num * num2;
    }

}

