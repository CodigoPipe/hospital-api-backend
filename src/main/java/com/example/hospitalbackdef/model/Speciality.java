package com.example.hospitalbackdef.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity(name = "Speciality")
@Table(name = "speciality")
@Data
@NoArgsConstructor
public class Speciality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long specialityId;

    private String name;

    private String physician;

    @OneToMany(
            cascade = CascadeType.REMOVE,
            fetch = FetchType.EAGER,
            targetEntity = Patient.class,
            mappedBy = "speciality"
    )
    @JsonManagedReference
    private List<Patient> patients = new ArrayList<>();

    public Speciality(Long specialityId, String name, String physician) {
        this.specialityId = specialityId;
        this.name = name;
        this.physician = physician;
    }

    //Metodo creado para añadir pacientes a la list patients
    /*public Speciality addPatient(Patient patient){
        this.patients.add(patient);
        return this;
    }*/

}
