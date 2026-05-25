package com.hospital.hospitalapi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository
        extends JpaRepository<
        Patient,
        Long> {
}