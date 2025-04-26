package com.rohan.HospitalManagementSystem.repository;

import com.rohan.HospitalManagementSystem.entity.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<Patients, Integer> {
}
