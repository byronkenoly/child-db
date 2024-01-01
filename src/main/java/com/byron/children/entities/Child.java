package com.byron.children.entities;

import jakarta.persistence.*;

import java.util.Calendar;
@Entity
public class Child {
    @Id
    private String regNumber;
    private String name;
    private String placeOfBirth;
    @Temporal(TemporalType.DATE)
    private Calendar dateOfBirth;
    private String gender;
    private Float weight;
    @ManyToOne
    @JoinColumn(name = "motherId")
    private Mother mother;

    public String getRegNumber(){
        return regNumber;
    }

    public void setRegNumber(String regNumber){
        this.regNumber = regNumber;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPlaceOfBirth(){
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth){
        this.placeOfBirth = placeOfBirth;
    }

    public Calendar getDateOfBirth(){
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public float getWeight(){
        return weight;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public Mother getMother(){
        return mother;
    }

    public void setMother(Mother mother){
        this.mother = mother;
    }
}
