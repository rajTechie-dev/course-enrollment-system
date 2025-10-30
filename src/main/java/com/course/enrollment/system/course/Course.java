package com.course.enrollment.system.course;

public class Course {

    private String courseName;
    private String courseCode;
    private int maxCapacity;
    private int currentEnrollment;

    public Course(String courseName, String courseCode, int maxCapacity) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.maxCapacity = maxCapacity;
        this.currentEnrollment = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentEnrollment() {
        return currentEnrollment;
    }

    public boolean isFull() {
        return currentEnrollment >= maxCapacity;
    }

    public void incrementEnrollment() {
        currentEnrollment++;
    }

    /**
     * Checks if the course code is valid.
     * A valid course code must have a length between 3 and 7 characters (inclusive).
     *
     * @param courseCode The course code to validate.
     * @return true if the course code is valid, false otherwise.
     */
    public static boolean isValidCourseCode(String courseCode) {
        if (courseCode == null) {
            return false;
        }
        int length = courseCode.length();
        return length >= 3 && length <= 7;
    }
}