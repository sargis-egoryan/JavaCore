package chapter9;

import javax.security.auth.callback.Callback;

public class Client implements Callback {
    public void callback(int p) {
        System.out.println("метод callback()," + p);
    }

   public void nonifacemeth() {
        System.out.println("в классах реализующих интерфейсы" + "могут определяться и другие члены");
    }
}
