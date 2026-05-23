package com.hospital.hospitalapi.model;

import jakarta.persistence.*;

@Entity

@Table(name = "patients")

public class Patient {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    private int age;

    private String disease;

    private String patientType;

    private String roomNumber;

    private int daysAdmitted;

    private String medicine;

    private double totalBill;

    private String visitDate;

    // GETTERS AND SETTERS

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getDisease() {

        return disease;
    }

    public void setDisease(String disease) {

        this.disease = disease;
    }

    public String getPatientType() {

        return patientType;
    }

    public void setPatientType(String patientType) {

        this.patientType = patientType;
    }

    public String getRoomNumber() {

        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {

        this.roomNumber = roomNumber;
    }

    public int getDaysAdmitted() {

        return daysAdmitted;
    }

    public void setDaysAdmitted(int daysAdmitted) {

        this.daysAdmitted = daysAdmitted;
    }

    public String getMedicine() {

        return medicine;
    }

    public void setMedicine(String medicine) {

        this.medicine = medicine;
    }

    public double getTotalBill() {

        return totalBill;
    }

    public void setTotalBill(double totalBill) {

        this.totalBill = totalBill;
    }

    public String getVisitDate() {

        return visitDate;
    }

    public void setVisitDate(String visitDate) {

        this.visitDate = visitDate;
    }
}