package com.example.hospitalbackdef.service;

import com.example.hospitalbackdef.model.Patient;
import com.example.hospitalbackdef.model.PatientDTO;
import com.example.hospitalbackdef.model.Speciality;
import com.example.hospitalbackdef.model.SpecialityDTO;

import java.util.List;

public interface HospitalService {

    SpecialityDTO createSpeciality(SpecialityDTO specialityDTO);

    PatientDTO createUpdatePatient(PatientDTO patientDTO);

    SpecialityDTO updateSpeciality(SpecialityDTO specialityDTO);

    //PatientDTO updatePatient(PatientDTO patientDTO);

    void deleteSpeciality(SpecialityDTO specialityDTO);

    void deletePatient(PatientDTO patientDTO);



    List<Speciality> findAllSpecialities();

    List<Patient> findAllPatients();


}
