package com.userapp.service;

import com.userapp.IvalidationService;
import exception.NameExistsException;
import exception.TooLongException;
import exception.TooShortException;

public class ValidationServiceImpl implements IvalidationService {

    public boolean validatePassword(String password) throws TooShortException, TooLongException {
        if (password.length() < 6) {
            throw new TooShortException();
        } else if (password.length() > 18) {
            throw new TooLongException();
        } else {
            return true;
        }
    }

    @Override
    public boolean ValidateUsername(String username) throws NameExistsException {
        return false;
    }
}