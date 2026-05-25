package com.example.hospitalapi.repository;

import com.example.hospitalapi.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository
        extends JpaRepository<
        Patient,
        Long
        > {
}