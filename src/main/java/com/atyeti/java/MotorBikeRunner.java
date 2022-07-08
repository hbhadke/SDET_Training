package com.atyeti.java;

public class MotorBikeRunner {
    public static void main(String []args){
        MotorBike honda  = new MotorBike(100);
        MotorBike ducati = new MotorBike(200);

        honda.start();
        ducati.start();

        ducati.setSpeed(80);
        ducati.increaseSpeed(30);
        honda.increaseSpeed(20);
        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());

        ducati.increaseSpeed(10);
        honda.increaseSpeed(10);
        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());

    }
}
