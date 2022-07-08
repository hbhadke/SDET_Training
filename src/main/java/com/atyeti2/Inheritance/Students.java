package com.atyeti2.Inheritance;

public class Students extends Person{
    private String college;
    private int year;

    public String getCollege() {
        return college;
    }
    Students(){

    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
