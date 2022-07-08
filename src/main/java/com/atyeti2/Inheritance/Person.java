package com.atyeti2.Inheritance;

public class Person {
    private String name;
    private  String email;
    private  double phoneNumber;

    public String getEmail() {
        return email;
    }
 public Person(String name){
        super();
        this.name=name;

 }
public  Person(){
        System.out.println("Person Constructor");
}
    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString(){
        return name +" # " +email;
    }
}
