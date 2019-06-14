package Reflex;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class StudentMain {
    public static void main(String[] args) throws NoSuchMethodException {
        Student student=new Student();
        Method getGroupMethod = Student.class.getMethod("getGroup");
        Annotation[] annotations = getGroupMethod.getAnnotations();
        System.out.println(Arrays.toString(annotations));
        for (Annotation annotation : annotations) {
            annotation.annotationType();
        }
    }
}
