package com.voterapp.exception;

public class InvalidVoterId extends Exception{

    public InvalidVoterId() {
    }

    public InvalidVoterId(String message) {
        super(message);
    }
}
