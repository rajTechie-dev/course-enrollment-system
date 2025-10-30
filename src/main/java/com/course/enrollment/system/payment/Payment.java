
package com.course.enrollment.system.payment;

public class Payment {

    /**
     * Processes a payment and checks if the amount is valid.
     * A valid payment amount must be between 10.0 and 1000.0 (inclusive).
     *
     * @param amount The payment amount to process.
     * @return true if the payment is successful, false otherwise.
     */
    public boolean processPayment(double amount) {
        return amount >= 10.0 && amount <= 1000.0;
    }
}
