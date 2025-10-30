
package com.course.enrollment.system.course;

public class Course {

    /**
     * Checks if the course code is valid.
     * A valid course code must have a length between 3 and 7 characters (inclusive).
     *
     * @param courseCode The course code to validate.
     * @return true if the course code is valid, false otherwise.
     */
    public boolean isValidCourseCode(String courseCode) {
        if (courseCode == null) {
            return false;
        }
        int length = courseCode.length();
        return length >= 3 && length <= 7;
    }
}
