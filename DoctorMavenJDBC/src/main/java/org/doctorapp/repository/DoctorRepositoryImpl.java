package org.doctorapp.repository;

import org.doctorapp.exceptions.DoctorNotFoundException;
import org.doctorapp.model.Doctor;
import org.doctorapp.util.DoctorDb;
import org.doctorapp.util.Queries;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DoctorRepositoryImpl implements IDoctorRepository {
    @Override
    public void  addDoctor(Doctor doctor)  {
       //establish a connection
        //create a prepared statement
        //set values for placeholders
        //call execute
        try(Connection connection = DoctorDb.OpenConnection();
            PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);
        ){
            statement.setString(1,doctor.getDoctorName());
            statement.setString(2,doctor.getSpeciality());
            statement.setInt(3,doctor.getExperience());
            statement.setInt(4,doctor.getRatings());
            statement.setDouble(5,doctor.getFees());
            //call execute
            boolean result = statement.execute();
            System.out.println("one row inserted "+!result);
        }catch (Exception e ){
            e.printStackTrace();
        }

    }

    @Override
    public void updateDoctor(int doctorId, double fees) {
        try (Connection connection = DoctorDb.OpenConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.UPDATEQUERY);
        ) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteDoctor(int doctorId) {

    }

    @Override
    public void findId(int doctorId) {

    }

    @Override
    public List<Doctor> findAll()  {
        List<Doctor> doctorList = new ArrayList<>();
        try(Connection connection = DoctorDb.OpenConnection();
       PreparedStatement statement = connection.prepareStatement(Queries.FINDALLQUERY);
            ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()){
                int doctorID = resultSet.getInt("doctor_id");
                String doctorname = resultSet.getString("doctor_name");
                String speciality = resultSet.getString("speciality");
                int experience = resultSet.getInt("experince");
                int ratings = resultSet.getInt("ratings");
                double fees = resultSet.getDouble("fees");
                Doctor doctor =new Doctor(doctorID,doctorname,speciality,fees,ratings,experience);
                doctorList.add(doctor);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } ;
        return doctorList;
    }

    @Override
    public List<Doctor> findSpeciality(String speciality) throws DoctorNotFoundException {
        List<Doctor> doctorList = new ArrayList<>();
        try (Connection connection = DoctorDb.OpenConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECIALITY);
        ) {
            statement.setString(1, speciality);
            try (ResultSet resultSet = statement.executeQuery();) {
                while (resultSet.next()) {
                    String doctorName = resultSet.getString("doctor_name");
                    int experience = resultSet.getInt("experince");
                    int ratings = resultSet.getInt("ratings");
                    int doctorId = resultSet.getInt("doctor_id");
                    double fees = resultSet.getDouble("fees");
                    Doctor doctor = new Doctor();
                    doctor.setDoctorName(doctorName);
                    doctor.setSpeciality(speciality);
                    doctor.setExperience(experience);
                    doctor.setRatings(ratings);
                    doctor.setFees(fees);
                    doctor.setDoctorId(doctorId);

                    doctorList.add(doctor);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorList;



    }

    @Override
    public List<Doctor> findSpecialityAndExp(String speciality, int experince) throws DoctorNotFoundException {
        return null;
    }

    @Override
    public List<Doctor> findSpecialityAndLessFees(String speciality, double fees) throws DoctorNotFoundException {
        return null;
    }

    @Override
    public List<Doctor> findSpecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundException {
        return null;
    }

    @Override
    public List<Doctor> findSpecialityAndNameContains(String speciality, String doctorName) throws DoctorNotFoundException {
        List<Doctor> doctorList = new ArrayList<>();
        try (Connection connection = DoctorDb.OpenConnection();
             PreparedStatement statement = connection.prepareStatement(Queries.FINDBYSPECANDNAME);
        ){
            statement.setString(1, speciality);
            statement.setString(2,"%"+ doctorName + "%");
            try(ResultSet resultSet = statement.executeQuery();){
                while (resultSet.next()){
                    Doctor doctor = new Doctor();
                    doctor.setDoctorName(resultSet.getString("doctor_name"));
                    doctor.setSpeciality(resultSet.getString("speciality"));
                    doctor.setExperience(resultSet.getInt("experince"));
                    doctor.setRatings(resultSet.getInt("ratings"));
                    doctor.setFees(resultSet.getDouble("fees"));
                    doctor.setDoctorId(resultSet.getInt("doctor_id"));
                    doctorList.add(doctor);


                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return doctorList;
    }

    @Override
    public Doctor findById(int doctorId) {
        return null;
    }
}
