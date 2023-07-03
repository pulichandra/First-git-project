import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@interface MyAnnotation{
    int value();
}

class hello{
    @MyAnnotation(value = 10)
    public void sayHello() {
        System.out.print("Hello My Annotation");
    }
}

public class TestCustomAnnotation {
    public static void main(String[] arg) throws Exception {
        hello h = new hello();
        Method m = h.getClass().getMethod("sayHello");

        MyAnnotation ma = m.getAnnotation(MyAnnotation.class);
        System.out.println("values are: "+ma.value());
    }
}
