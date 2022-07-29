package com.example.hospitalbackdef.controller;


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

    @GetMapping
    public List<Speciality> getAllSpecialities(){
        return service.findAllSpecialities();
    }

    @PostMapping("create/speciality")
    public SpecialityDTO createSpeciality(@RequestBody SpecialityDTO speciality){
        return service.createSpeciality(speciality);
    }

}
