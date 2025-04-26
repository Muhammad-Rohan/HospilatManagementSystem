package com.rohan.HospitalManagementSystem.service;

import com.rohan.HospitalManagementSystem.entity.Appointments;
import com.rohan.HospitalManagementSystem.repository.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AppointmentService {

    @Autowired
    private AppointmentRepo repo;

    public List<Appointments> getAllAppointments() {
        return repo.findAll();
    }

    public Appointments getAppointmentById(int id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Appointment Not Found " +id));
    }
                                //create appointment

//    public Appointments createAppointment(Appointments appointment) {
//        appointment.getDoctors().getAppointments().add(appointment);
//        appointment.getPatients().getAppointments().add(appointment);
//
//        return repo.save(appointment);
//    }

    public void createAppointment(Appointments appointment) {
        if (appointment.getDoctors() == null) {
            throw new IllegalArgumentException("Doctor must be provided for the appointment.");
        }
        if (appointment.getPatients() == null) {
            throw new IllegalArgumentException("Patient must be provided for the appointment.");
        }
        appointment.getDoctors().getAppointments().add(appointment);
        appointment.getPatients().getAppointments().add(appointment);
        repo.save(appointment);
    }






}
