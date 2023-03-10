package chapter12;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface myAnno {
    String str() default "тестирование";

    int val() default 9000;
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    myAnno[] value();
}

public class RepeatAnno {
    @myAnno(str = "первая фннотфция", val = -1)
    @myAnno(str = "вторая аннотация", val = 100)
    public static void MyMeth(String str, int i) {


        RepeatAnno ob = new RepeatAnno();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("MyMeth", String.class, int.class);
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        } catch (NoSuchMethodException exc) {
            System.out.println("метод не найден");
        }
    }

    public static void main(String[] args) {
        MyMeth("test", 10);
    }
}
