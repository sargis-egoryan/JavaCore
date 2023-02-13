package chapter9;

public class AccountBalance {
    public static void main(String[] args) {
        Balance current[] = new Balance[3];
        current[0] = new Balance("k.f.fielding", 123.23);
        current[1] = new Balance("dh.h.", 15.62);
        current[2] = new Balance("ds.f", 45.20);
        for (int i = 0; i < 3; i++) current[i].show();
    }
}
