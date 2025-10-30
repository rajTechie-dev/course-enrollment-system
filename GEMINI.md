# Project Overview

This is a Java project managed with Maven. It is a simple course enrollment system with a command-line interface. The project uses Java 8 and JUnit 5 for testing.

The package name for this project is `com.course.enrollment.system`.

The 6 modules are:
- Admin
- Authentication
- Course
- Enrollment
- Payment
- Student

# Building and Running

## Building the project

To build the project, run the following command in the root directory:

```bash
mvn clean install
```

## Running the application

To run the application, use the following command:

```bash
mvn exec:java -Dexec.mainClass="com.course.enrollment.system.main.Main"
```

This will start the command-line interface for the course enrollment system.

# Development Conventions

*   **Code Style:** The code follows standard Java conventions.
*   **Testing:** You can add your own unit tests in the `src/test/java` directory.
*   **Dependencies:** Dependencies are managed in the `pom.xml` file.