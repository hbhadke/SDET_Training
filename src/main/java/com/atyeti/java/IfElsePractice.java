package com.atyeti.java;

import java.util.Scanner;

public class IfElsePractice {

    public  static  void ifElse1(){
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();

        if (time < 9) {
            System.out.println("On time");
        } else {
            System.out.println("Late");
        }

    }
    public  static  void ElseIf(){
        Scanner sc1 = new Scanner(System.in);
        int time = sc1.nextInt();

        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }}
