package com.example.hospitalbackdef.service;

import com.example.hospitalbackdef.model.Patient;
import com.example.hospitalbackdef.model.PatientDTO;
import com.example.hospitalbackdef.model.Speciality;
import com.example.hospitalbackdef.model.SpecialityDTO;
import com.example.hospitalbackdef.repository.PatientRepo;
import com.example.hospitalbackdef.repository.SpecialityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class HospitalServiceImpl implements HospitalService{

    //dependencies
    @Autowired
    private SpecialityRepo specialityRepo;

    @Autowired
    private PatientRepo patientRepo;

    //methods to convert from dto to entity and viceversa
    private Speciality returnSpeciality(SpecialityDTO specialityDTO){

        Speciality speciality = new Speciality(specialityDTO.getSpecialityId(),specialityDTO.getName(),specialityDTO.getPhysician());
        return speciality;
    }
    private SpecialityDTO returnSpecialityDTO(Speciality speciality){

        SpecialityDTO specialityDTO = new SpecialityDTO(speciality.getName(), speciality.getPhysician(), speciality.getSpecialityId());
        return specialityDTO;
    }

    private String returnString(List<String> appointments){

        String appointmentChain = appointments.stream().map(n -> String.valueOf(n)).collect(Collectors.joining(","));
        return appointmentChain;

    }

    private Patient returnPatient(PatientDTO patientDTO){

        Patient patient = new Patient(patientDTO.getPatientId(), patientDTO.getName(), patientDTO.getAge(), patientDTO.getDni(), returnString(patientDTO.getAppointments()));
        return patient;
    }

    private PatientDTO returnPatientDTO(Patient patient){

        PatientDTO patientDTO = new PatientDTO(patient.getPatientId(), patient.getName(), patient.getAge(), patient.getDni(), null,patient.getSpeciality());
        return patientDTO;
    }




    @Override
    public SpecialityDTO createSpeciality(SpecialityDTO specialityDTO) {

       Speciality speciality = returnSpeciality(specialityDTO);

        return returnSpecialityDTO(specialityRepo.save(speciality));

    }

    @Override
    public SpecialityDTO createPatient(PatientDTO patientDTO) {
        Patient patient = returnPatient(patientDTO);

        return null;
    }

    @Override
    public SpecialityDTO updateSpeciality(SpecialityDTO specialityDTO) {
        return null;
    }

    @Override
    public SpecialityDTO updatePatient(PatientDTO patientDTO) {
        return null;
    }

    @Override
    public void deleteSpeciality(SpecialityDTO specialityDTO) {

    }

    @Override
    public void deletePatient(PatientDTO patientDTO) {

    }

    @Override
    public List<Speciality> findAllSpecialities() {
        return null;
    }
}
