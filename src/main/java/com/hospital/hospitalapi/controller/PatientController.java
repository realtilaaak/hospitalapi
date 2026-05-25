package com.hospital.hospitalapi.controller;

import com.hospital.hospitalapi.model.Patient;
import com.hospital.hospitalapi.repository.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
@CrossOrigin(origins = "*")
public class PatientController {

    @Autowired
    private PatientRepository repo;

    @GetMapping
    public List<Patient> getAllPatients() {
        return repo.findAll();
    }

    @PostMapping
    public Patient addPatient(
            @RequestBody Patient patient
    ) {
        return repo.save(patient);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(
            @PathVariable Long id
    ) {
        repo.deleteById(id);
    }
}