package com.byron.children.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mother {

    @Id
    private int id;
    private String name;
    private int age;
    private String occupation;
    private String maritalStatus;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getOccupation(){
        return occupation;
    }

    public void setOccupation(String occupation){
        this.occupation = occupation;
    }

    public String getMaritalStatus(){
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus){
        this.maritalStatus = maritalStatus;
    }
}
