package com.example.hospitalbackdef.controller;


import com.example.hospitalbackdef.model.Patient;
import com.example.hospitalbackdef.model.PatientDTO;
import com.example.hospitalbackdef.model.Speciality;
import com.example.hospitalbackdef.model.SpecialityDTO;
import com.example.hospitalbackdef.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//croosOrigin permite hacer peticiones desde el front
@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/")
public class Controller {

    @Autowired
    private HospitalService service;

    @GetMapping("specialities")
    public List<Speciality> getAllSpecialities(){
        return service.findAllSpecialities();
    }

    @GetMapping("patients")
    public List<Patient> getAllpatients(){
        return service.findAllPatients();
    }

    @PostMapping("create/speciality")
    public SpecialityDTO createSpeciality(@RequestBody SpecialityDTO speciality){
        return service.createSpeciality(speciality);
    }

    @PostMapping("create/patient")
    public PatientDTO createUpdatePatient(@RequestBody PatientDTO patientDTO){
        return service.createUpdatePatient(patientDTO);
    }

    @DeleteMapping("delete/speciality/{specialityId}")
    public void deleteSpeciality(@PathVariable Long specialityId){

         service.deleteSpeciality(specialityId);
    }

    @DeleteMapping("delete/patient/{patientId}")
    public void deletePatient(@PathVariable Long patientId){

        service.deletePatient(patientId);
    }

    @PutMapping("update/speciality")
    public SpecialityDTO updateSpeciality(@RequestBody SpecialityDTO specialityDTO){
        return service.updateSpeciality(specialityDTO);
    }

    @PutMapping("update/patient")
    public PatientDTO updatePatient(@RequestBody PatientDTO patientDTO){
            return service.createUpdatePatient(patientDTO);
    }


}
