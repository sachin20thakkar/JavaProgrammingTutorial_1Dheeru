package com.javaprogramming.chapcom;

public class StudentTest {

    public static void main(String[] args) {
        int[] students = new int[] {1001, 1002, 1003};

        Student student1 = new Student(students[0], "joan");
        student1.gender = "male";

        Student student2 = new Student(students[1], "raj");
        student2.gender = "male";

        Student student3 = new Student(students[2], "anita");
        student3.gender = "female";

        System.out.println("Name of student1 "+student1.name);
        System.out.println("Name of student1 "+student2.name);
        System.out.println("Name of student1 "+student3.name);

        student1.updateProfile("john");
        System.out.println("Updated name of student1 "+student1.name);


    }
}
