package com.voterapp.service;


import com.voterapp.exception.NotEligableException;

public interface IElectionBoothService {

    boolean checkEligibility(int age,String locality,int vid)throws NotEligableException;
}
