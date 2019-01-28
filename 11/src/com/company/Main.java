package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(18, "Anna"));
        students.add(new Student(29, "Victor"));
        students.add(new Student(24, "Alex"));
        students.add(new Student(31, "Roman"));
        students.add(new Student(18, "Object1"));
        students.add(new Student(31, "Vladimir"));
        students.add(new Student(24, "R2D2"));
        students.add(new Student(18, "Maria"));
        students.add(new Student(29, "Oleg"));

        listEdit(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void listEdit(List<Student> students) {

        List<Student> newList = new ArrayList<>();
        for (Student student : students) {
            newList.add(student);
        }

        for (Student student : newList) {
            int firstTimeAge = student.getAge();
            for (Student student1 : newList) {
                if (student1.getAge() == firstTimeAge &&
                        newList.indexOf(student1) > newList.indexOf(student)) {
                    students.remove(student1);
                }
            }
        }
    }

}
