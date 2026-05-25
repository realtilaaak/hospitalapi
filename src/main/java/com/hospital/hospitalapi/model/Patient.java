package com.hospital.hospitalapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy =
            GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer age;

    private String disease;

    private String roomNumber;

    private String visitDate;

    public Patient() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(
            String name
    ) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(
            Integer age
    ) {
        this.age = age;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(
            String disease
    ) {
        this.disease = disease;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(
            String roomNumber
    ) {
        this.roomNumber = roomNumber;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(
            String visitDate
    ) {
        this.visitDate = visitDate;
    }
}