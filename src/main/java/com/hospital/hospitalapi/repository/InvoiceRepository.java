package com.hospital.hospitalapi.repository;

import com.hospital.hospitalapi.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository
        extends JpaRepository<
        Invoice,
        Long
        > {
}