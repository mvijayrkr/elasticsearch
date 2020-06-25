package com.dbs.edsf.elasticsearch.entity;

import java.util.Date;

public class Users {

    String full_name;
    String bio;
    int age;
    String location;
    String enjoys_coffee;
    Date created_on;

    public Users(){

    }
    public Users(String full_name, String bio, int age, String location, String enjoys_coffee, Date created_on) {
        this.full_name = full_name;
        this.bio = bio;
        this.age = age;
        this.location = location;
        this.enjoys_coffee = enjoys_coffee;
        this.created_on = created_on;
    }



    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEnjoys_coffee() {
        return enjoys_coffee;
    }

    public void setEnjoys_coffee(String enjoys_coffee) {
        this.enjoys_coffee = enjoys_coffee;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }


}
