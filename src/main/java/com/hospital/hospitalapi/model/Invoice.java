package com.hospital.hospitalapi.model;

import jakarta.persistence.*;

@Entity
public class Invoice {

    @Id
    @GeneratedValue(
            strategy =
                    GenerationType.IDENTITY
    )
    private Long id;

    private String patient;
    private Double amount;
    private String date;
    private String payment;

    public Invoice() {
    }

    public Long getId() {
        return id;
    }

    public void setId(
            Long id
    ) {
        this.id = id;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(
            String patient
    ) {
        this.patient = patient;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(
            Double amount
    ) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(
            String date
    ) {
        this.date = date;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(
            String payment
    ) {
        this.payment = payment;
    }
}