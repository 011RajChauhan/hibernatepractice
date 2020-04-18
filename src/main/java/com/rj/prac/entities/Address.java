package com.rj.prac.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

    @Column(name="user_city")
    private String city;
    @Column(name="user_country")
    private String country;


    public Address() {
    }

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
