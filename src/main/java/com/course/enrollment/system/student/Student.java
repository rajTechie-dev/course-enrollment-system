package com.course.enrollment.system.student;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int age;
    private String studentId;
    private List<String> enrolledCourses;

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    public List<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollCourse(String courseId) {
        enrolledCourses.add(courseId);
    }

    /**
     * Checks if the student's age is valid for enrollment.
     * A student must be between 18 and 35 years old (inclusive) to enroll.
     *
     * @param age The age of the student.
     * @return true if the student's age is valid, false otherwise.
     */
    public static boolean isAgeValidForEnrollment(int age) {
        return age >= 18 && age <= 35;
    }
}