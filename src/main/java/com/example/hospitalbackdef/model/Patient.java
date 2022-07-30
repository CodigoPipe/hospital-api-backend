package com.example.hospitalbackdef.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

    private String appointments;

    public Patient(Long patientId, String name, int age, Long dni, String appointments,Speciality speciality) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.dni = dni;
        this.appointments = appointments;
        this.speciality = speciality;
    }

    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(name = "specialityId")
    @JsonBackReference
    private Speciality speciality;


}
