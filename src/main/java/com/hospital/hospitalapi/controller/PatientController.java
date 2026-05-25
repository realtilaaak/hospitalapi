package com.example.hospital.controller;

import com.example.hospital.model.Patient;
import com.example.hospital.repository.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin("*")

public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/patients")
    public List<Patient> getAllPatients(){

        return patientRepository.findAll();
    }

    @PostMapping("/patients")
    public Patient addPatient(
            @RequestBody Patient patient
    ){

        return patientRepository.save(
                patient
        );
    }

    @DeleteMapping("/patients/{id}")
    public ResponseEntity<String> deletePatient(
            @PathVariable Long id
    ){

        patientRepository.deleteById(
                id
        );

        return ResponseEntity.ok(
                "Deleted"
        );
    }
}