package Reflex;

import Annotation.AnnotationExam;

public class Student extends Person {
    private String group;

    @AnnotationExam(param = "hello", param1 = 100)
    public String getGroup() {
        return group;
    }
}
