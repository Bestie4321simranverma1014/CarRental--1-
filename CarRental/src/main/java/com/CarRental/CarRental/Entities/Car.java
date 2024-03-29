package com.CarRental.CarRental.Entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "mst_car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long car_id;
    private String brand;
    private String model;
    private int year;
    private BigDecimal pricePerDay;
    private String city;

    public Long getId() {
        return car_id;
    }

    public void setId(Long id) {
        this.car_id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
