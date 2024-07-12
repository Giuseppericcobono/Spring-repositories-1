package com.example.demo_repository1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String modelname;

    @Column(nullable = false)
    private String serialNumber;

    @Column(nullable = true)
    private Double currentPrice;

    public Car() {}

    public Car(Integer id, String modelname, String serialNumber, Double currentPrice) {
        this.id = id;
        this.modelname = modelname;
        this.serialNumber = serialNumber;
        this.currentPrice = currentPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }
}
