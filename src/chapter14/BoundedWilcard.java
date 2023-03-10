package chapter14;

class BoundedWildcard {
    static void showXY(Coords<?> c) {
        System.out.println("координатыXY");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("координатыXYZ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
        }
        System.out.println();
    }

    static void showALL(Coords<? extends FourD> c) {
        System.out.println("координаты XYZT");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
        }
    }

    public static void main(String[] args) {
        TwoD tD[] = {
                new TwoD(0, 0),
                new TwoD(7, 9),
                new TwoD(18, 4),
                new TwoD(-1, -23),
        };
        Coords<TwoD> tDlocs = new Coords<TwoD>(tD);
        System.out.println("содержимое объекта tDlocs");


        FourD fD[] = {
                new FourD(1, 2, 3, 4),
                new FourD(6, 8, 14, 8),
                new FourD(22, 9, 4, 9),
                new FourD(3, -2, -23, 17)
        };

        Coords<FourD> fDlocs = new Coords<FourD>(fD);
        System.out.println("содержимое объекта fDlocs");
        showXY(fDlocs);
        showXYZ(fDlocs);
        showALL(fDlocs);
    }
}
