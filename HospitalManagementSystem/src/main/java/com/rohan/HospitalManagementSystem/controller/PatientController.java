package com.rohan.HospitalManagementSystem.controller;

import com.rohan.HospitalManagementSystem.entity.Doctors;
import com.rohan.HospitalManagementSystem.entity.Patients;
import com.rohan.HospitalManagementSystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping("/all")
    public List<Patients> getAllPatients() {
        return patientService.getAllPatients();
    }

    @PostMapping("/patient-registration")
    public void register(@RequestBody Patients patient) {
        patientService.registration(patient);
    }

    @GetMapping("/patient/{id}")
    public Patients getPatientById(@PathVariable int id) {
        return patientService.getPatientById(id);
    }





}
