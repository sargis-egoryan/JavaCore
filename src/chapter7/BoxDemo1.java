package chapter7;

public class BoxDemo1 {
    public static void main(String[] args) {
        Box1 mybox1 = new Box1(10, 20, 15);
        Box1 mybox2 = new Box1();
        Box1 mycube = new Box1(7);
        Box1 myclone = new Box1(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println(vol);
        vol = mybox2.volume();
        System.out.println(vol);
        vol = mycube.volume();
        System.out.println(vol);
        vol = myclone.volume();
        System.out.println(vol);
    }
}
