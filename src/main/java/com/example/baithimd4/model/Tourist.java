package com.example.baithimd4.model;

import javax.persistence.*;

@Entity
@Table
public class Tourist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double acreage;
    private String city;
    private String description;
    private double GDP;
    @ManyToOne
    private Country country;

    public Tourist() {
    }

    public Tourist(int id, double acreage, String city, String description, double GDP, Country country) {
        this.id = id;
        this.acreage = acreage;
        this.city = city;
        this.description = description;
        this.GDP = GDP;
        this.country = country;
    }

    public Tourist(double acreage, String city, String description, double GDP, Country country) {
        this.acreage = acreage;
        this.city = city;
        this.description = description;
        this.GDP = GDP;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAcreage() {
        return acreage;
    }

    public void setAcreage(double acreage) {
        this.acreage = acreage;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String name) {
        this.city = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getGDP() {
        return GDP;
    }

    public void setGDP(double GDP) {
        this.GDP = GDP;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
