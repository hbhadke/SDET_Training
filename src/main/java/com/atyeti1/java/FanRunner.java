package com.atyeti1.java;

public class FanRunner {
    public  static void main(String [] args){

        Fan f = new Fan("usha",1.2,"Brown");
        System.out.println(f);
        f.switchOn();
        f.setSpeed((byte)5);
        System.out.println(f);
        f.switchOff();
        f.setSpeed((byte) 0);
        System.out.println(f);

    }
}
