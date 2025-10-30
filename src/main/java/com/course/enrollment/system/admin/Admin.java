package com.course.enrollment.system.admin;

public class Admin {

    /**
     * Checks if the given username is a valid admin username.
     * A valid admin username must be between 5 and 15 characters long (inclusive).
     *
     * @param username The username to validate.
     * @return true if the username is valid, false otherwise.
     */
    public boolean isValidAdminUsername(String username) {
        if (username == null) {
            return false;
        }
        int length = username.length();
        return length >= 5 && length <= 15;
    }
}
