package homework.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator mycalculator = new Calculator();
        double vol;
        vol = mycalculator.plus(8, 9);
        System.out.println(vol);
        vol = mycalculator.minus(20,12);
        System.out.println(vol);
        vol = mycalculator.divide(8, 0);
        System.out.println(vol);
        vol = mycalculator.multiply(9,5);
        System.out.println(vol);
    }
}
