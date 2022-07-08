package com.atyeti.java;

public class MotorBike {
    //state
    private int speed;//member variable
    //behaviour==method
MotorBike(){
    this(5);
}
MotorBike(int speed){
    this.speed=speed;
}

    void start() {
        System.out.println("Bike started");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed>0)
        this.speed = speed;
    }

    public int increaseSpeed(int byHowMuch) {
        return this.speed = this.speed + byHowMuch;
    }

    public int decreaseSpeed(int byHowMuch) {
        return this.speed = this.speed - byHowMuch;
    }
}
