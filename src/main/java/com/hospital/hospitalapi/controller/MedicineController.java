package com.hospital.hospitalapi.controller;

import com.hospital.hospitalapi.model.Medicine;
import com.hospital.hospitalapi.repository.MedicineRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicines")
@CrossOrigin(origins = "*")
public class MedicineController {

    @Autowired
    private MedicineRepository repo;

    @GetMapping
    public List<Medicine> getAllMedicines() {

        return repo.findAll();
    }

    @PostMapping
    public Medicine saveMedicine(
            @RequestBody Medicine medicine
    ) {

        return repo.save(
                medicine
        );
    }

    @DeleteMapping("/{id}")
    public void deleteMedicine(
            @PathVariable Long id
    ) {

        repo.deleteById(
                id
        );
    }
}