package com.example.hospitalbackdef.repository;

import com.example.hospitalbackdef.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long> {


}
