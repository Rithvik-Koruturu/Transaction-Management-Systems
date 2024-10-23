package com.example.transaction.exception;

public class TransactionException extends RuntimeException {

    private String errorMessage;

    // Constructor
    public TransactionException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

    // Getter for error message
    public String getErrorMessage() {
        return errorMessage;
    }

    // Optional: Custom toString method for better exception logging
    @Override
    public String toString() {
        return "TransactionException: " + errorMessage;
    }
}
