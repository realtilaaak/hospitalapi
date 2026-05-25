package com.hospital.hospitalapi.repository;

import com.hospital.hospitalapi.model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository
        extends JpaRepository<Medicine, Long> {
}