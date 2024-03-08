package com.voterapp.exception;

public class NotEligableException extends Exception {
    public NotEligableException() {
    }

    public NotEligableException(String message) {
        super(message);
    }
}
