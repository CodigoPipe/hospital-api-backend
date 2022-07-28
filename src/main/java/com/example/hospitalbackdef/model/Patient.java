package com.example.hospitalbackdef.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Patient")
@Table(name = "patient")
@Data
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;

    private String name;

    private int age;

    private Long dni;

    private Long numberOfAppointments;

    private String appointment;

    private List<String> appointments;


    //Metodo creado para añadir citas a la list appointments
    public void addAppointment(String appointment){
        this.appointments.add(appointment);
    }


}
