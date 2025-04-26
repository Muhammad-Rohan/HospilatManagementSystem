package com.rohan.HospitalManagementSystem.controller;

import com.rohan.HospitalManagementSystem.entity.Doctors;
import com.rohan.HospitalManagementSystem.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    public DoctorService doctorService;

    @GetMapping("/all")
    public List<Doctors> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @GetMapping("/doctor/{id}")
    public Optional<Doctors> getDoctorByID(@PathVariable int id) {
        return doctorService.getDoctorByID(id);
    }

    


}
