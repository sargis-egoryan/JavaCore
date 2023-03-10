package chapter12;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
    int value();
}

public class Single {
    @MySingle(100)
    public static void MyMeth() {
        Single ob = new Single();
        try {
            Method m = ob.getClass().getMethod("MyMeth");
            MySingle anno = m.getAnnotation(MySingle.class);
            System.out.println(anno.value());
        } catch (NoSuchMethodException exc) {
            System.out.println("метод не найден");
        }
    }

    public static void main(String[] args) {
        MyMeth();
    }
}
