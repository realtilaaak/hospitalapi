package com.hospital.hospitalapi.controller;

import com.hospital.hospitalapi.model.Patient;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import java.util.List;

@RestController

@RequestMapping("/patients")

public class PatientController {

    List<Patient> patientList =
            new ArrayList<>();

    @GetMapping

    public List<Patient> getPatients() {

        return patientList;
    }

    @PostMapping

    public Patient addPatient(
            @RequestBody Patient patient
    ) {

        patientList.add(patient);

        return patient;
    }
}