package com.hospital.hospitalapi.controller;

import com.hospital.hospitalapi.model.Doctor;
import com.hospital.hospitalapi.repository.DoctorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
@CrossOrigin(origins = "*")
public class DoctorController {

    @Autowired
    private DoctorRepository repo;

    @GetMapping
    public List<Doctor> getAllDoctors() {
        return repo.findAll();
    }

    @PostMapping
    public Doctor addDoctor(
            @RequestBody Doctor doctor
    ) {
        return repo.save(doctor);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(
            @PathVariable String id
    ) {
        repo.deleteById(id);
    }
}