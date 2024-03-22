package com.voterapp.service;


import com.voterapp.exception.InvalidVoterId;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligableException;

public interface IElectionBoothService {

    boolean checkEligibility(int age,String locality,int vid) throws NotEligableException, InvalidVoterId, LocalityNotFoundException;
}
