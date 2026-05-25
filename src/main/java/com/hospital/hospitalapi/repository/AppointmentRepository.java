package com.hospital.hospitalapi.repository;

import com.hospital.hospitalapi.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository
        extends JpaRepository<Appointment, Long> {
}