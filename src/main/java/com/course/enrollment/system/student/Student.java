
package com.course.enrollment.system.student;

public class Student {

    /**
     * Checks if the student's age is valid for enrollment.
     * A student must be between 18 and 35 years old (inclusive) to enroll.
     *
     * @param age The age of the student.
     * @return true if the student's age is valid, false otherwise.
     */
    public boolean isAgeValidForEnrollment(int age) {
        return age >= 18 && age <= 35;
    }
}
