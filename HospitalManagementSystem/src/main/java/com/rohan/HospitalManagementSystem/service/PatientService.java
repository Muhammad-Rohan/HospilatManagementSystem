package com.rohan.HospitalManagementSystem.service;

import com.rohan.HospitalManagementSystem.entity.Patients;
import com.rohan.HospitalManagementSystem.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    PatientRepo patientRepo;

    public List<Patients> getAllPatients() {
        return patientRepo.findAll();
    }

    public void registration(Patients patient) {
        patientRepo.save(patient);
    }

    public Patients getPatientById(int id) {
        return patientRepo.findById(id).orElse(new Patients());
    }


}
