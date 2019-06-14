package Reflex;

import java.lang.reflect.Field;

public class StudentFields {
    public static void main(String[] args) {
        printAllFields(Student.class);
    }

    private static void printAllFields(Class<Student> clazz) {
        System.out.println("fielgs in" + clazz.getSimpleName());
        for (Field declaredField : clazz.getDeclaredFields()) {
            System.out.println(declaredField.getType().getSimpleName() + " "
                    + declaredField.getName());
        }
        Class superclass = clazz.getSuperclass();
        if (superclass != null) {
            printAllFields(superclass);
        }
    }
}
