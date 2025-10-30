
package com.course.enrollment.system.authentication;

public class Authentication {

    /**
     * Validates a password based on its length.
     * A valid password must be between 8 and 20 characters long (inclusive).
     *
     * @param password The password to validate.
     * @return true if the password is valid, false otherwise.
     */
    public boolean isPasswordStrong(String password) {
        if (password == null) {
            return false;
        }
        int length = password.length();
        return length >= 8 && length <= 20;
    }
}
