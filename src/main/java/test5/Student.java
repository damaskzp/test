package test5;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String FistName;
    private String LastName;
    private int age;

    public Student(String fistName, String lastName, int age) {
        FistName = fistName;
        LastName = lastName;
        this.age = age;
    }

    public String getFistName() {
        return FistName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return age;
    }
}
