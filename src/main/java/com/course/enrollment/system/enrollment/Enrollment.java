
package com.course.enrollment.system.enrollment;

public class Enrollment {

    /**
     * Checks if the number of enrolled students is within the valid range.
     * The number of students must be between 1 and 100 (inclusive).
     *
     * @param studentCount The number of students to check.
     * @return true if the student count is within the valid range, false otherwise.
     */
    public boolean isStudentCountValid(int studentCount) {
        return studentCount >= 1 && studentCount <= 100;
    }
}
