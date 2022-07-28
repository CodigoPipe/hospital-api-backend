package com.example.hospitalbackdef.repository;

import com.example.hospitalbackdef.model.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityRepo extends JpaRepository<Speciality,Long> {
}
