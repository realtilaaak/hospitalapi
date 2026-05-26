package com.hospital.hospitalapi.model;

import jakarta.persistence.*;

@Entity
public class Medicine {

    @Id
    @GeneratedValue(
            strategy =
                    GenerationType.IDENTITY
    )
    private Long id;

    private String name;
    private String category;
    private String stock;
    private String price;
    private String expiry;

    public Medicine() {
    }

    public Long getId() {
        return id;
    }

    public void setId(
            Long id
    ) {
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

    public String getCategory() {
        return category;
    }

    public void setCategory(
            String category
    ) {
        this.category = category;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(
            String stock
    ) {
        this.stock = stock;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(
            String price
    ) {
        this.price = price;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(
            String expiry
    ) {
        this.expiry = expiry;
    }
}