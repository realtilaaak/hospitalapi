package com.example.hospitalapi.controller;

import com.example.hospitalapi.model.Patient;
import com.example.hospitalapi.repository.PatientRepository;

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
}