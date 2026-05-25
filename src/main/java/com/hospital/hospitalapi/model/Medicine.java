package com.hospital.hospitalapi.model;

import jakarta.persistence.*;

@Entity
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private Integer stock;
    private Double price;
    private String expiryDate;

    public Medicine() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getStock() {
        return stock;
    }

    public Double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}