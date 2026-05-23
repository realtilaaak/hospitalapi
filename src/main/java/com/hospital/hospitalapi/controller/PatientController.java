package com.hospital.hospitalapi.controller;

import com.hospital.hospitalapi.model.Patient;

import com.hospital.hospitalapi.repository.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/patients")

public class PatientController {

    @Autowired

    private PatientRepository repository;

    // GET ALL PATIENTS

    @GetMapping

    public List<Patient> getPatients() {

        return repository.findAll();
    }

    // ADD PATIENT

    @PostMapping

    public Patient addPatient(

            @RequestBody Patient patient

    ) {

        return repository.save(patient);
    }
}