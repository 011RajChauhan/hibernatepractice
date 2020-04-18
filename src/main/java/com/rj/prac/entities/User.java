package com.rj.prac.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String name;


    private Address HomeAddress;

    private Address OfficeAddress;


    public User(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getHomeAddress() {
        return HomeAddress;
    }

    public Address getOfficeAddress() {
        return OfficeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        OfficeAddress = officeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        HomeAddress = homeAddress;
    }
}
