package com.atyeti2.Inheritance;

import java.math.BigDecimal;

public class Employee extends Person {
    private String title;
    private String emplyor;
    private char grade;
    private BigDecimal salary;

 public Employee(){
     System.out.println("Employee Constructor");
 }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmplyor() {
        return emplyor;
    }

    public void setEmplyor(String emplyor) {
        this.emplyor = emplyor;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String toString() {
return String.format("");
    }

}
