package com.voterapp.service;

import com.voterapp.exception.InvalidVoterId;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligableException;
import com.voterapp.exception.UnderAgeException;

public class ElectionServiceImpl implements IElectionBoothService  {
    @Override
    public boolean checkEligibility(int age, String locality, int vid) throws NotEligableException, InvalidVoterId, LocalityNotFoundException {
        if (age<18){
            throw new UnderAgeException("ur not eligible");
        } else if (!locality.equalsIgnoreCase("Bangalore")) {
            throw new LocalityNotFoundException("ur not eligible");

        } else if (vid<20) {
          throw new InvalidVoterId("ur not eligible");
        }
        else {
            return true;

        }

    }
}
