package chapter9;

import javax.security.auth.callback.Callback;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        ((Client) c).callback(42);
    }
}
