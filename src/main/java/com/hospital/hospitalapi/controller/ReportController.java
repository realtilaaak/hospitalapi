package com.hospital.hospitalapi.controller;

import com.hospital.hospitalapi.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/reports")
@CrossOrigin(origins = "*")
public class ReportController {

    @Autowired
    private PatientRepository patientRepo;

    @Autowired
    private DoctorRepository doctorRepo;

    @Autowired
    private AppointmentRepository appointmentRepo;

    @Autowired
    private InvoiceRepository invoiceRepo;

    @Autowired
    private MedicineRepository medicineRepo;

    @GetMapping
    public Map<String, Object> getReport() {

        Map<String, Object> report =
                new HashMap<>();

        report.put(
                "patients",
                patientRepo.count()
        );

        report.put(
                "doctors",
                doctorRepo.count()
        );

        report.put(
                "appointments",
                appointmentRepo.count()
        );

        report.put(
                "invoices",
                invoiceRepo.count()
        );

        report.put(
                "medicines",
                medicineRepo.count()
        );

        return report;
    }
}