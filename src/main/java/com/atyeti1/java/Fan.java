package com.atyeti1.java;

public class Fan {
    //state

    private String make;
    private double radius;
    private boolean isOn;
    private byte speed;
    private String color;

    public  void switchOn(){
        this.isOn=true;
       setSpeed((byte)5);
    }
    public  void switchOff(){
        this.isOn=false;
        setSpeed((byte)0);

    }

    public  void setSpeed(byte speed){
        this.speed=speed;
    }
 Fan(String make,double radius, String color){
     this.make=make;
     this.radius=radius;
     this.color=color;
 }

 public  String toString(){
   return   String.format("make- %s, radius- %f,isOn- %b, speed- %b, color- %s ",make,radius,isOn,speed,color);
 }
}
