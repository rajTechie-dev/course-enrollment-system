package com.course.enrollment.system.enrollment;

import com.course.enrollment.system.course.Course;
import com.course.enrollment.system.student.Student;

public class Enrollment {

    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }
}