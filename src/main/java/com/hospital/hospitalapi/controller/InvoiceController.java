package com.hospital.hospitalapi.controller;

import com.hospital.hospitalapi.model.Invoice;
import com.hospital.hospitalapi.repository.InvoiceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invoices")
@CrossOrigin(origins = "*")
public class InvoiceController {

    @Autowired
    private InvoiceRepository repo;

    @GetMapping
    public List<Invoice> getAll() {

        return repo.findAll();
    }

    @PostMapping
    public Invoice save(
            @RequestBody Invoice invoice
    ) {

        return repo.save(
                invoice
        );
    }

    @DeleteMapping("/{id}")
    public void delete(
            @PathVariable Long id
    ) {

        repo.deleteById(
                id
        );
    }
}