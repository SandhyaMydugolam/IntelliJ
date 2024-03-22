package com.voterapp.exception;

public class UnderAgeException extends NotEligableException {
    public UnderAgeException() {
    }

    public UnderAgeException(String message) {
        super(message);
    }
}
