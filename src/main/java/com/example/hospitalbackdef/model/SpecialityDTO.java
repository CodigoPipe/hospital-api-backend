package com.example.hospitalbackdef.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SpecialityDTO {

    private String name;

    private String physician;

    private Long specialityId;

    public SpecialityDTO(String name, String physician, Long specialityId) {
        this.name = name;
        this.physician = physician;
        this.specialityId = specialityId;
    }
}
