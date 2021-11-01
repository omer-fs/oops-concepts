package com.basicsstrong.oop;

import java.util.ArrayList;
import java.util.List;

class College {
    String name;
    private List<Teacher> teacher;
    public College(String name, List<Teacher> teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public List<Teacher> getTeachers() {
        return teacher;
    }

}

class Teacher {
    String name;
    String subject;
    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
public class AggregationDemo {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher("Ron", "Java"));
        teachers.add(new Teacher("John", "Python"));

        College college = new College("MyCollege", teachers);
    }
}
