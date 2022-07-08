package com.atyeti2.Inheritance;

public class StudentRunner {
    public static  void main(String []args){
        Students s= new Students();
       // s.setName("Harsh");
        s.setEmail("hashal@yahoo");

        Person p=new Person();
        String st=p.toString();
        System.out.println(p);
        System.out.println(p);

        Employee e=new Employee();
        e.setName("Harsh");
        e.setEmail("hashal@yahoo");
        e.setPhoneNumber(7709777);
             e.setEmplyor("atyeti");
             e.setGrade('A');

             System.out.println(e);

             System.out.println(e);

    }
}
