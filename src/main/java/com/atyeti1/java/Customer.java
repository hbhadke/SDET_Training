package com.atyeti1.java;

public class Customer {
    private String name;
    private Address homeAddress;
    private Address workAddress;

    public Customer(String name,Address workAddress){
        this.name=name;
        this.workAddress=workAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public String toString(){
        return String.format("name-%s workAddress- %s homeddress-%s",name,workAddress,homeAddress);
    }
}
