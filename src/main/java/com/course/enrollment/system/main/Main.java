package com.course.enrollment.system.main;

import com.course.enrollment.system.course.Course;
import com.course.enrollment.system.student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final List<Student> students = new ArrayList<>();
    private static final List<Course> courses = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCourse Enrollment System");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Enroll Student in Course");
            System.out.println("4. View Students");
            System.out.println("5. View Courses");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    addCourse(scanner);
                    break;
                case 3:
                    enrollStudent(scanner);
                    break;
                case 4:
                    viewStudents();
                    break;
                case 5:
                    viewCourses();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (!Student.isAgeValidForEnrollment(age)) {
            System.out.println("Student age must be between 18 and 35.");
            return;
        }

        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();

        students.add(new Student(name, age, studentId));
        System.out.println("Student added successfully.");
    }

    private static void addCourse(Scanner scanner) {
        System.out.print("Enter course name: ");
        String name = scanner.nextLine();
        System.out.print("Enter course code: ");
        String code = scanner.nextLine();

        if (!Course.isValidCourseCode(code)) {
            System.out.println("Course code must be between 3 and 7 characters.");
            return;
        }

        System.out.print("Enter max capacity: ");
        int capacity = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        courses.add(new Course(name, code, capacity));
        System.out.println("Course added successfully.");
    }

    private static void enrollStudent(Scanner scanner) {
        System.out.print("Enter student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();

        Student student = findStudentById(studentId);
        Course course = findCourseByCode(courseCode);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        if (course == null) {
            System.out.println("Course not found.");
            return;
        }

        if (course.isFull()) {
            System.out.println("Course is full.");
            return;
        }

        student.enrollCourse(course.getCourseCode());
        course.incrementEnrollment();
        System.out.println("Student enrolled successfully.");
    }

    private static void viewStudents() {
        System.out.println("\nStudents:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getStudentId() + ", Enrolled Courses: " + student.getEnrolledCourses());
        }
    }

    private static void viewCourses() {
        System.out.println("\nCourses:");
        for (Course course : courses) {
            System.out.println("Name: " + course.getCourseName() + ", Code: " + course.getCourseCode() + ", Enrollment: " + course.getCurrentEnrollment() + "/" + course.getMaxCapacity());
        }
    }

    private static Student findStudentById(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    private static Course findCourseByCode(String courseCode) {
        for (Course course : courses) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        return null;
    }
}