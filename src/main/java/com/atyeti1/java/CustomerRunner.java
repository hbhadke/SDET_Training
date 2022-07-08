package com.atyeti1.java;

public class CustomerRunner {
    public static void main(String [] args){
 Address a=new Address("line1","Pune",444606);
        Customer c= new Customer("Harshal",a);
        System.out.println(c);

        Address a1= new Address("lin2 ","HAdapsar",444609);
        c.setWorkAddress(a1);
        System.out.println(c);

    }
}
