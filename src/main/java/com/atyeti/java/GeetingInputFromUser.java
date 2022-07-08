package com.atyeti.java;

import java.util.Scanner;

public class GeetingInputFromUser {
    public  static void method1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int number = sc.nextInt();
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Are you OK?  ");
        boolean t_f = sc.nextBoolean();
    }
    }