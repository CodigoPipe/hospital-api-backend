package com.example.hospitalbackdef.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Patient")
@Table(name = "patient")
@Data
@NoArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;

    private String name;

    private int age;

    private Long dni;

    private Long numberOfAppointments;

    private String appointment;

    public Patient(Long patientId, String name, int age, Long dni, String appointment,Speciality speciality) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.dni = dni;
        this.appointment = appointment;
        this.speciality = speciality;
    }

    @ManyToOne
    @JoinColumn(name = "specialityId")
    private Speciality speciality;




}
