package com.example.hospitalbackdef.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PatientDTO {


    private Long patientId;

    private String name;

    private int age;

    private Long dni;

    private Speciality speciality;

    public PatientDTO(Long patientId, String name, int age, Long dni, List<String> appointments, Speciality speciality) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.dni = dni;
        this.appointments = appointments;
        this.speciality = speciality;
    }

    private List<String> appointments;

    /*//Metodo creado para añadir citas a la list appointments
    public void addAppointment(String appointment){
        this.appointments.add(appointment);
    }*/

}
