package com.example.hospitalbackdef.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Speciality")
@Table(name = "speciality")
@Data
public class Speciality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long specialityId;

    private String name;

    private String physician;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )

    private Set<Patient> patients;

    public Speciality(Long specialityId, String name, String physician) {
        this.specialityId = specialityId;
        this.name = name;
        this.physician = physician;
    }

    //Metodo creado para añadir pacientes a la list patients
    public Speciality addPatient(Patient patient){
        this.patients.add(patient);
        return this;
    }

}
