package com.rohan.HospitalManagementSystem.repository;

import com.rohan.HospitalManagementSystem.entity.Appointments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointments, Integer> {
}
