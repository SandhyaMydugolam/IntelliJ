package com.userapp;

import exception.NameExistsException;
import exception.TooLongException;
import exception.TooShortException;

public interface IvalidationService {

    boolean validatePassword(String password) throws TooShortException, TooLongException;
    boolean ValidateUsername(String username) throws NameExistsException;



    }



