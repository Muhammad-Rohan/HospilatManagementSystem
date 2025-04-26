package com.rohan.HospitalManagementSystem.controller;

import com.rohan.HospitalManagementSystem.entity.Appointments;
import com.rohan.HospitalManagementSystem.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("/all-appointments")
    public List<Appointments> getAllAppointments() {
        return appointmentService.getAllAppointments();
    }

    @GetMapping("/appointment/{id}")
    public Appointments getAppointmentById(@PathVariable int id) {
        return appointmentService.getAppointmentById(id);
    }

    @PostMapping("/add-appointment")
    public void createAppointment(@RequestBody Appointments appointments) {
        appointmentService.createAppointment(appointments);
    }

}
