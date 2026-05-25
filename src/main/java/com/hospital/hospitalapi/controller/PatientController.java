package com.hospital.hospitalapi;

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

    @GetMapping("/{id}")
    public Patient getPatientById(
            @PathVariable Long id
    ) {
        return repo.findById(id)
                .orElse(null);
    }

    @DeleteMapping("/{id}")
    public String deletePatient(
            @PathVariable Long id
    ) {
        repo.deleteById(id);
        return "Deleted";
    }
}