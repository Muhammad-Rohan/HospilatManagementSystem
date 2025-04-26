package com.rohan.HospitalManagementSystem.service;

import com.rohan.HospitalManagementSystem.entity.Doctors;
import com.rohan.HospitalManagementSystem.repository.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    DoctorRepo doctorRepo;

    public List<Doctors> getAllDoctors() {
        return doctorRepo.findAll();
    }

    public Optional<Doctors> getDoctorByID(int id) {
        return doctorRepo.findById(id);
    }




}
