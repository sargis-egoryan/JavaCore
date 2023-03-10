package chapter12;


import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();

    int val();
}

public class Meta {
    @myanno(str = "пример анотации", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            myanno anno = m.getAnnotation(myanno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
