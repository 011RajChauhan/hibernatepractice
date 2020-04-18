package com.rj.prac.entities;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="city", column = @Column(name="user_home_city")),
            @AttributeOverride(name="country", column = @Column(name="user_home_country")),
    })
    private Address HomeAddress;

    @Embedded
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
