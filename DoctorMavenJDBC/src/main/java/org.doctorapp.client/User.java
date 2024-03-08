package org.doctorapp.client;

import org.doctorapp.exceptions.DoctorNotFoundException;
import org.doctorapp.model.Doctor;
import org.doctorapp.model.Specialization;
import org.doctorapp.service.DoctorServiceImpl;
import org.doctorapp.service.IDoctorService;

import java.util.List;

public class User {
    public static void main(String[] args) {
        IDoctorService doctorService = new DoctorServiceImpl();
        //enum constant
//        Specialization specialization = Specialization.GYNAEC;
//        String speciality = specialization.getSpeciality();
//        Doctor doctor = new Doctor("kavitha",speciality,1000,8,10);
//        Doctor doctor1 = new Doctor("john",speciality,800,8,10);
//        Doctor doctor2 = new Doctor("chand",speciality,500,9,3);
//        Doctor doctor3 = new Doctor("siri",speciality,500,9,3);
//        Doctor doctor4 = new Doctor("kruthi",speciality,500,9,3);
//        doctorService.addDoctor(doctor4);
        List<Doctor> doctorList = doctorService.getAll();
        for (Doctor doctor : doctorList){
            System.out.println(doctor);
        }

        try {
            doctorList = doctorService.getBySpeciality("GYNAECOLOGIST");
            for (Doctor doctor: doctorList){
                System.out.println(doctor);
            }
        } catch (DoctorNotFoundException e) {
           e.printStackTrace();
        }

        System.out.println("-------------------------");
        System.out.println("By speciality and name");


        try {
            doctorList = doctorService.getBySpecialityAndNameContains("GYNAECOLOGIST","i");
            for (Doctor doctor: doctorList){
                System.out.println(doctor);
            }
        } catch (DoctorNotFoundException e) {
            e.printStackTrace();
        }

    }
}
