package com.sjcl.zrsy.domain;

import javax.xml.crypto.Data;

public class Pig_Birth {
    private String id;
    private String date;
    private String breed;
    private String gender;
    private double weight;

    public Pig_Birth(){
    }

    public Pig_Birth(String id, String  date, String breed, String gender, double weight) {
        this.id = id;
        this.date = date;
        this.breed = breed;
        this.gender = gender;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public String  getDate() {
        return date;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setId(String  id) {
        this.id = id;
    }

    public void setDate(String  date) {
        this.date = date;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
