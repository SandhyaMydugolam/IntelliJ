package com.userapp.client;


import com.userapp.IvalidationService;
import com.userapp.service.ValidationServiceImpl;
import exception.NameExistsException;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) throws NameExistsException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your userName");
        String username = sc.next();
        IvalidationService validationService = new ValidationServiceImpl();
        try {
            if(validationService.ValidateUsername(username))
                System.out.println("Enter password");
            String userpassword = sc.next();
            try {
                if (validationService.ValidateUsername(username));
            }
        }
    }
}
