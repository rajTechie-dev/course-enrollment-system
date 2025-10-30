# Project Overview

This is a Java project managed with Maven. It consists of 6 modules, each containing a simple function with clear boundaries for testing, particularly for boundary value analysis. The project uses Java 8 and JUnit 5 for testing.

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

## Running tests

To run the tests, use the following command:

```bash
mvn test
```

# Development Conventions

*   **Code Style:** The code follows standard Java conventions.
*   **Testing:** Unit tests are written using JUnit 5 and are located in the `src/test/java` directory. Each module has its own test class.
*   **Dependencies:** Dependencies are managed in the `pom.xml` file.