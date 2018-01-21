package Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationTest {

    public static void test(){
        try {
            for (Method m:
                 Class.forName("Annotation.AnnotationTest").getMethods()) {

                if (m.isAnnotationPresent(Testable.class)){
                    m.invoke(null);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Testable
    public static void test1(){
        System.out.println("test1");
    }

    @Testable
    public static void test2(){
        System.out.println("test2");
    }

    public static void test3(){
        System.out.println("test3");
    }
}
