package com.iwona.ExecuteAnnotatedMethod;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Arrays;


public class ExecuteTest {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Class<?> clazz = User.class;
        System.out.println("Class name: " + clazz.getName());

        Method[] metods = clazz.getDeclaredMethods();
        for (Method method : metods) {
            System.out.println(" Method: ");
            System.out.println("     method name: " + method.getName());


            Annotation[] annotations = method.getAnnotations();
            for (Annotation a : annotations) {
                System.out.println("  Annotation: " + a.annotationType().getName());
                if (a.annotationType() == Execute.class) {
                    Execute e = (Execute) a;
                    System.out.println("  str: " + e.str());
                    System.out.println("   value: " + e.value());
                }
            }
        }
    }
}
