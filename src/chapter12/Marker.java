package chapter12;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {

}

public class Marker {
    @MyMarker
    public static void MyMeth() {
        Marker ob = new Marker();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            if (m.isAnnotationPresent(MyMarker.class)) {
                System.out.println("маркерная аннотация MyMarker присуствует");
            }
        } catch (NoSuchMethodException exc) {
            System.out.println("метод не найден");
        }
    }

    public static void main(String[] args) {
        MyMeth();
    }
}
