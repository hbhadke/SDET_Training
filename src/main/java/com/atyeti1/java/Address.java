package com.atyeti1.java;

public class Address {


    private String line1;
    private String city;
    private int zip;

    public Address(String line1, String city, int zip) {
        this.line1 = line1;
        this.city = city;
        this.zip = zip;
    }
    public String toString(){
        return String.format("line1- %s city- %s zip- %d",line1,city,zip);
    }
}
