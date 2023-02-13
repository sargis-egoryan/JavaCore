package chapter9;

import javax.security.auth.callback.Callback;

abstract class Incomplete implements Callback {
    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }
}
