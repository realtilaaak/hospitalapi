package com.hospital.hospitalapi.controller;

import com.hospital.hospitalapi.model.Appointment;
import com.hospital.hospitalapi.repository.AppointmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
@CrossOrigin(origins = "*")
public class AppointmentController {

    @Autowired
    private AppointmentRepository repo;

    @GetMapping
    public List<Appointment> getAllAppointments() {
        return repo.findAll();
    }

    @PostMapping
    public Appointment addAppointment(
            @RequestBody Appointment appointment
    ) {
        return repo.save(appointment);
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(
            @PathVariable Long id
    ) {
        repo.deleteById(id);
    }
}