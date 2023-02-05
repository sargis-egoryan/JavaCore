package chapter8;

public class BoxWeight2 extends Box2 {
    private double weight;

    BoxWeight2(BoxWeight2 ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight2(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight2(double len, double m) {
        super(len);
        weight = m;
    }
}
