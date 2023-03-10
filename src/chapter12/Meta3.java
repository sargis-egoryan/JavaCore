package chapter12;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface myanno {

    String str() default "тестирование";

    int val() default 9000;
}

public class Meta3 {
    @myanno()
    public static void myMeth() {
        Meta3 ob = new Meta3();
        try {
            Class<?> с = ob.getClass();
            Method m = с.getMethod("myMeth");
            myanno anno = m.getAnnotation(myanno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException ехс) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
