package com.voterapp.client;

import com.voterapp.exception.InvalidVoterId;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligableException;
import com.voterapp.service.ElectionServiceImpl;
import com.voterapp.service.IElectionBoothService;

public class User {
    public static void main(String[] args) {
        IElectionBoothService iElectionBoothService = new ElectionServiceImpl();
        try {
            boolean result = iElectionBoothService.checkEligibility(18,"Bangalore",21);
            if (result){
                System.out.println("you are eligible");
            }else {
                System.out.println("you are not eligible");
            }
        } catch (NotEligableException | InvalidVoterId | LocalityNotFoundException e){
            e.printStackTrace();
        }
        }
    }

