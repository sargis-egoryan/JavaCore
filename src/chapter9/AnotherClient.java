package chapter9;

import javax.security.auth.callback.Callback;

public class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("еще один вариант метода callback()");
        System.out.println("p в квадрате равно" + p * p);
    }
}
